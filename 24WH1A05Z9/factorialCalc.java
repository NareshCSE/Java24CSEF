package intro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCalculator extends JFrame implements ActionListener {

    private JTextField inputField, resultField;
    private JButton computeButton;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Labels
        add(new JLabel("Enter Integer:"));
        inputField = new JTextField();
        add(inputField);

        add(new JLabel("Factorial Value:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        computeButton = new JButton("Compute");
        computeButton.addActionListener(this);
        add(computeButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());

            if (number < 0) {
                resultField.setText("Invalid! Enter positive number.");
                return;
            }

            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            resultField.setText(String.valueOf(factorial));

        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FactorialCalculator::new);
    }
}
