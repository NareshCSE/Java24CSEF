package intro;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionApp extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public IntegerDivisionApp() {

        setTitle("Integer Division");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Labels and text fields
        add(new JLabel("Num 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Num 2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Convert text to integers
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            // Division (may throw ArithmeticException if num2 = 0)
            int result = num1 / num2;

            // Display result
            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Number Format Exception: Please enter valid integers!",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                    "Arithmetic Exception: Cannot divide by zero!",
                    "Math Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(IntegerDivisionApp::new);
    }
}

