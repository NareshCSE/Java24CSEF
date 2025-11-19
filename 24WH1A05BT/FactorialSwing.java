package javaPrograms;
import javax.swing.*;
import java.awt.event.*;

public class Factorial {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labelInput = new JLabel("Enter a Number:");
        labelInput.setBounds(30, 30, 150, 30);
        frame.add(labelInput);
        JTextField textInput = new JTextField();
        textInput.setBounds(180, 30, 150, 30);
        frame.add(textInput);
        JLabel labelResult = new JLabel("Factorial:");
        labelResult.setBounds(30, 90, 150, 30);
        frame.add(labelResult);
        JTextField textResult = new JTextField();
        textResult.setBounds(180, 90, 150, 30);
        textResult.setEditable(false);
        frame.add(textResult);
        JButton btnCompute = new JButton("Compute");
        btnCompute.setBounds(120, 150, 150, 40);
        frame.add(btnCompute);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(textInput.getText());
                    long fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    textResult.setText(String.valueOf(fact));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter a valid integer!",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setVisible(true);
    }
}
