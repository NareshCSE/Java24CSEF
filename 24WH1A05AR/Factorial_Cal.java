package mid2.java;

import  javax.swing.*;
import java.awt.event.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame =new JFrame("Factorial Calculator");
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel label1=new JLabel("Enter a number");
		label1.setBounds(30,30,120,25);
		frame.add(label1);
		
		JTextField inputfield=new JTextField();
		inputfield.setBounds(150,30,150,25);
		frame.add(inputfield);
		
		JLabel label2=new JLabel("Factorial");
		label2.setBounds(30,70,120,40);
		frame.add(label2);
		
		JTextField result=new JTextField();
		result.setBounds(150,30,150,25);
		frame.add(result);
		
		JButton button =new JButton("Compute");
		button.setBounds(120,110,100,30);
		frame.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					int num=Integer.parseInt(inputfield.getText());
					long fact=1;
					for(int i=1;i<=num;i++) {
						fact*=i;
						
					}
					result.setText(String.valueOf(fact));
					
				}
				catch(NumberFormatException ex) {
					result.setText("Invalid Input");
				}
					
				
			}
		});
		frame.setVisible(true);
		

	}

}
