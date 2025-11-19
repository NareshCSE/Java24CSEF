package assignment_problems;

import javax.swing.*;
import java.awt.event.*;

public class DivisonSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel num1Label = new JLabel("Num1:");
        num1Label.setBounds(30, 20, 50, 25);
        frame.add(num1Label);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(90, 20, 100, 25);
        frame.add(num1Field);

        JLabel num2Label = new JLabel("Num2:");
        num2Label.setBounds(30, 60, 50, 25);
        frame.add(num2Label);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(90, 60, 100, 25);
        frame.add(num2Field);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(30, 150, 50, 25);
        frame.add(resultLabel);

        JTextField resultField = new JTextField();
        resultField.setBounds(90, 150, 180, 25);
        resultField.setEditable(false);
        frame.add(resultField);

        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(90, 100, 100, 25);
        frame.add(divideButton);

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText().trim());
                    int num2 = Integer.parseInt(num2Field.getText().trim());

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    resultField.setText("Error: Input must be an integer");
                } catch (ArithmeticException ex) {
                    resultField.setText("Error: Division by zero");
                }
            }
        });

        frame.setVisible(true);
    }
}
