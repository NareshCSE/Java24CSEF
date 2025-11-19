package frames;
import javax.swing.*;
import java.awt.event.*;

public class FactorialFrames {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Factorial Calculator");
        frame.setSize(400, 250);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Enter Number:");
        l1.setBounds(50, 40, 100, 30);
        frame.add(l1);

        JTextField input = new JTextField();
        input.setBounds(160, 40, 150, 30);
        frame.add(input);

        JLabel l2 = new JLabel("Factorial:");
        l2.setBounds(50, 90, 100, 30);
        frame.add(l2);

        JTextField output = new JTextField();
        output.setBounds(160, 90, 150, 30);
        output.setEditable(false); 
        frame.add(output);

        JButton btn = new JButton("Compute");
        btn.setBounds(140, 140, 100, 35);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(input.getText());
                    
                    if (n < 0) {
                        output.setText("Invalid!");
                        return;
                    }

                    long fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }

                    output.setText(String.valueOf(fact));

                } catch (Exception ex) {
                    output.setText("Error!");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}
