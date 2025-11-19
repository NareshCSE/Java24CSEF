package frames;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrames {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setLayout(null);

        JTextField display = new JTextField();
        display.setBounds(50, 30, 270, 40);
        frame.add(display);

        final double[] num1 = new double[1];
        final double[] num2 = new double[1];
        final char[] op = new char[1];

        JButton b1 = new JButton("1");
        b1.setBounds(50, 100, 60, 40);
        frame.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(120, 100, 60, 40);
        frame.add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(190, 100, 60, 40);
        frame.add(b3);

        JButton b4 = new JButton("4");
        b4.setBounds(50, 150, 60, 40);
        frame.add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(120, 150, 60, 40);
        frame.add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(190, 150, 60, 40);
        frame.add(b6);

        JButton b7 = new JButton("7");
        b7.setBounds(50, 200, 60, 40);
        frame.add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(120, 200, 60, 40);
        frame.add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(190, 200, 60, 40);
        frame.add(b9);

        JButton b0 = new JButton("0");
        b0.setBounds(50, 250, 60, 40);
        frame.add(b0);

        JButton add = new JButton("+");
        add.setBounds(260, 100, 60, 40);
        frame.add(add);

        JButton sub = new JButton("-");
        sub.setBounds(260, 150, 60, 40);
        frame.add(sub);

        JButton mul = new JButton("*");
        mul.setBounds(260, 200, 60, 40);
        frame.add(mul);

        JButton div = new JButton("/");
        div.setBounds(260, 250, 60, 40);
        frame.add(div);

        JButton eq = new JButton("=");
        eq.setBounds(120, 250, 60, 40);
        frame.add(eq);

        JButton clr = new JButton("C");
        clr.setBounds(190, 250, 60, 40);
        frame.add(clr);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // ONE LISTENER FOR EVERYTHING
        ActionListener allListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = ((JButton)e.getSource()).getText();

                if (text.matches("[0-9]")) {
                    display.setText(display.getText() + text);
                }
                else if (text.matches("[+\\-*/]")) {
                    num1[0] = Double.parseDouble(display.getText());
                    op[0] = text.charAt(0);
                    display.setText("");
                }
                else if (text.equals("=")) {
                    num2[0] = Double.parseDouble(display.getText());
                    double result = 0;

                    switch (op[0]) {
                        case '+': result = num1[0] + num2[0]; break;
                        case '-': result = num1[0] - num2[0]; break;
                        case '*': result = num1[0] * num2[0]; break;
                        case '/':
                            if (num2[0] == 0) { display.setText("Error"); return; }
                            result = num1[0] / num2[0];
                            break;
                    }
                    display.setText(String.valueOf(result));
                }
                else if (text.equals("C")) {
                    display.setText("");
                }
            }
        };

        JButton[] allButtons = { b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, add, sub, mul, div, eq, clr };
        for (JButton btn : allButtons) {
            btn.addActionListener(allListener);
        }
    }
}
