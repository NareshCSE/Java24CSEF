package mid2.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sim_cal extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3;
	JButton add,sub,mul,div;
	
	sim_cal(){
		JLabel L1=new JLabel("first number");
		JLabel L2=new JLabel("Second number");
		JLabel L3=new JLabel("Result");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		
		t3.setEditable(false);
		
		add=new JButton("+");
		sub=new  JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(L1);
		add(L2);
		add(L3);
		add(t1);
		add(t2);
		add(t3);
		
		
		add(add);
		add(sub);
		add(mul);
		add(div);
		
		setTitle("Calculator");
		setSize(250,250);
		
		setVisible(true);
	}
public void actionPerformed(ActionEvent e) {
	try {
		double a= Double.parseDouble(t1.getText());
		double b= Double.parseDouble(t2.getText());
		double c=0;
		
		if(e.getSource()==add) {
			c=a+b;
		}
		else if(e.getSource()==sub) {
			c=a-b;
		}
		else if(e.getSource()==mul) {
			c=a*b;
		}
		else if(e.getSource()==div) {
			c=a/b;
		}
		t3.setText(String.valueOf(c));
		
	}
	catch(Exception ex) {
		t3.setText("Error");
	}	
  }
public static void main(String[] args) {
		new sim_cal();

	}

}
