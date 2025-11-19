package awtSwing;

import javax.swing.*;
import java.awt.event.*;

public class DivisionUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Integer Division");
        frame.setSize(350, 250);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Num1:");
        l1.setBounds(30, 30, 80, 30);
        frame.add(l1);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(120, 30, 150, 30);
        frame.add(num1Field);

        JLabel l2 = new JLabel("Num2:");
        l2.setBounds(30, 70, 80, 30);
        frame.add(l2);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(120, 70, 150, 30);
        frame.add(num2Field);

        JLabel l3 = new JLabel("Result:");
        l3.setBounds(30, 110, 80, 30);
        frame.add(l3);

        JTextField resultField = new JTextField();
        resultField.setBounds(120, 110, 150, 30);
        resultField.setEditable(false);
        frame.add(resultField);

        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(50, 160, 100, 30);
        frame.add(divideButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(170, 160, 100, 30);
        frame.add(clearButton);

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                }
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter valid integers!",
                            "Number Format Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Cannot divide by ZERO!",
                            "Arithmetic Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
            }
        });

        frame.setVisible(true);
    }
}
