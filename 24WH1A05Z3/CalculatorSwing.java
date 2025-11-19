package assignment_problems;

import javax.swing.*;
import java.awt.event.*;

public class CalculatorSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(270, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField display = new JTextField();
        display.setBounds(20, 20, 220, 40);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(display);

        String[] buttons = {"7", "8", "9", "+",
                            "4", "5", "6", "-",
                            "1", "2", "3", "*",
                            "0", "%", "=", "C"};

        CalculatorActionListener calcListener = new CalculatorActionListener(display);

        for (int i = 0; i < buttons.length; i++) {
            JButton btn = new JButton(buttons[i]);
            int x = 20 + (i % 4) * 55;
            int y = 70 + (i / 4) * 50;
            btn.setBounds(x, y, 50, 40);
            frame.add(btn);
            btn.addActionListener(calcListener);
        }

        frame.setVisible(true);
    }

    static class CalculatorActionListener implements ActionListener {
        private JTextField display;
        private String operator = "";
        private double operand = 0;
        private boolean startNew = true;

        public CalculatorActionListener(JTextField display) {
            this.display = display;
        }

        public void actionPerformed(ActionEvent e) {
            String action = e.getActionCommand();

            if ("0123456789".contains(action)) {
                if (startNew) {
                    display.setText(action);
                    startNew = false;
                } else {
                    display.setText(display.getText() + action);
                }
            } else if (action.equals("C")) {
                display.setText("");
                operator = "";
                operand = 0;
                startNew = true;
            } else if (action.equals("=")) {
                try {
                    double second = Double.parseDouble(display.getText());
                    double result;
                    switch (operator) {
                        case "+": result = operand + second; break;
                        case "-": result = operand - second; break;
                        case "*": result = operand * second; break;
                        case "%": 
                            if (second == 0) {
                                display.setText("Error");
                                return;
                            }
                            result = operand % second; break;
                        default: result = second;
                    }
                    display.setText(String.valueOf(result));
                    operator = "";
                    operand = result;
                    startNew = true;
                } catch (Exception ex) {
                    display.setText("Error");
                    startNew = true;
                }
            } else {
                try {
                    operand = Double.parseDouble(display.getText());
                    operator = action;
                    startNew = true;
                } catch (Exception ex) {
                    display.setText("Error");
                    startNew = true;
                }
            }
        }
    }
}
