package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Factorial extends JFrame implements ActionListener {
	JTextField inputField,resultField;
	JButton computeBtn;
	public Factorial() {
		setTitle("Factorial Calculator");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,5,10,10));
		JLabel label1=new JLabel("Enter an Integer ");
		inputField=new JTextField();
		JLabel label2=new JLabel("Factorial ");
		resultField=new JTextField();
		resultField.setEditable(false);
		computeBtn=new JButton("Compute");
		computeBtn.addActionListener(this);
		add(label1);
		add(inputField);
		add(label2);
		add(resultField);
		add(computeBtn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
        String text = inputField.getText();
        try {
        	int n=Integer.parseInt(text);
        	if(n<0) {
        		resultField.setText("Negative Integers not allowed..");
        		return;
        	}
        	long fact=1;
        	for (int i=1;i<=n;i++) {
        		fact=fact*i;
        		
        	
        	}
            resultField.setText(fact + "");
        }catch(NumberFormatException ex) {
        	resultField.setText("Enter a Valid Number");
        }       
	}
	public static void main(String[] args) {
		new Factorial();
	}
}
