package standAlone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FactorialApp extends JFrame implements ActionListener{

	private static JTextField display,result;
	
	static JLabel enter,fact;	
	
	static JButton compute;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setTitle("Factorial");
		jf.setSize(400,400);
		jf.setLayout(null);
		
		enter= new JLabel("Enter the number");
		enter.setBounds(140,10, 100,10);
		enter.setVisible(true);
		jf.add(enter);
		
		
		
		display =new JTextField();
		display.setBounds(140,50, 100, 30);
		display.setEditable(true);
		display.setVisible(true);
		jf.add(display);
		
		fact = new JLabel("Factorial");
		fact.setBounds(140,110, 100,30);
		fact.setVisible(true);
		jf.add(fact);
		
		
		
		result =new JTextField();
		result.setBounds(140,150, 100,30);
		result.setEditable(false);
		result.setVisible(true);
		jf.add(result);
		
		compute = new JButton("Compute");
		compute.setBounds(140,250,100,30);
		compute.setVisible(true);
		jf.add(compute);
		
		FactorialApp fa = new FactorialApp();
        compute.addActionListener(fa);

    
        
        jf.setVisible(true);
		
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(display.getText());
		
		int fact1=1;
		for(int i=1;i<=num;i++) {
			fact1*=i;
		}
		result.setText(String.valueOf(fact1));
	}

}
