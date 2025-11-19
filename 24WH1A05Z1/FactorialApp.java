package awtSwing;

import javax.swing.*;
import java.awt.event.*;

public class FactorialApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Factorial Calculator");
        frame.setSize(350, 250);
        frame.setLayout(null);   
        
        JLabel label1 = new JLabel("Enter Number:");
        label1.setBounds(30, 30, 100, 30);
        frame.add(label1);

        JTextField inputField = new JTextField();
        inputField.setBounds(150, 30, 120, 30);
        frame.add(inputField);

        JLabel label2 = new JLabel("Factorial:");
        label2.setBounds(30, 120, 100, 30);
        frame.add(label2);

        JTextField resultField = new JTextField();
        resultField.setBounds(150, 120, 120, 30);
        resultField.setEditable(false);
        frame.add(resultField);

        JButton computeButton = new JButton("Compute");
        computeButton.setBounds(50, 70, 100, 30);
        frame.add(computeButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(170, 70, 100, 30);
        frame.add(clearButton);

        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField.getText());
                    long fact = 1;

                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }

                    resultField.setText(String.valueOf(fact));
                }
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter a valid integer!",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                resultField.setText("");
            }
        });

        frame.setVisible(true);
    }
}
