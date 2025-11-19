package frames;
import javax.swing.*;
import java.awt.event.*;

public class DivisionsFrames {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Integer Division");
        frame.setSize(400, 250);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Num1:");
        l1.setBounds(50, 30, 80, 30);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(130, 30, 150, 30);
        frame.add(t1);

        JLabel l2 = new JLabel("Num2:");
        l2.setBounds(50, 80, 80, 30);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(130, 80, 150, 30);
        frame.add(t2);

        JLabel l3 = new JLabel("Result:");
        l3.setBounds(50, 130, 80, 30);
        frame.add(l3);

        JTextField result = new JTextField();
        result.setBounds(130, 130, 150, 30);
        result.setEditable(false);
        frame.add(result);

        JButton divide = new JButton("Divide");
        divide.setBounds(140, 170, 100, 30);
        frame.add(divide);

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero!");
                    }

                    int res = num1 / num2;
                    result.setText(String.valueOf(res));
                }
                catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter valid integers!",
                            "Number Format Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                catch (ArithmeticException ae) {
                    JOptionPane.showMessageDialog(frame,
                            "Cannot divide by zero!",
                            "Arithmetic Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}
