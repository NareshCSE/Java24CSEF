package standAlone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Division extends JFrame implements ActionListener{

	static JLabel jl1, jl2,res;
	static JTextField t1,t2,result;
	static JButton divide;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame();
		jf.setTitle("Divison");
		jf.setSize(500,500);
		jf.setLayout(null);
		
		
		jl1 =new JLabel("Number1");
		jl1.setBounds(140,20,100,20);
		jl1.setVisible(true);
		jf.add(jl1);
		
		t1 =new JTextField();
		t1.setBounds(140,50, 100, 30);
		t1.setEditable(true);
		t1.setVisible(true);
		jf.add(t1);
		
		jl2 =new JLabel("Number2");
		jl2.setBounds(140,80,100,20);
		jl2.setVisible(true);
		jf.add(jl2);
		
		
		t2 =new JTextField();
		t2.setBounds(140,100, 100, 30);
		t2.setEditable(true);
		t2.setVisible(true);
		jf.add(t2);
		
		
		res =new JLabel("Result");
		res.setBounds(140,130,100,20);
		res.setVisible(true);
		jf.add(res);
		
		
		result =new JTextField();
		result.setBounds(100,170,200, 35);
		result.setEditable(false);
		result.setVisible(true);
		jf.add(result);
		
		
		
		
		divide = new JButton("Division");
		divide.setBounds(140,220,100,30);
		divide.setVisible(true);
		jf.add(divide);
		
		Division fa = new Division();
        divide.addActionListener(fa);

		
		jf.setVisible(true);
		

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		try {
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			
			int ans=num1/num2;
			result.setText(String.valueOf(ans));
		} catch(NumberFormatException n){
			result.setText("Give numbers are not integers");
			JOptionPane db= new JOptionPane();
			JOptionPane.showMessageDialog(db,n.getMessage());
		} catch(ArithmeticException a) {
			result.setText("Divison by Zero");
			JOptionPane db1= new JOptionPane();
			JOptionPane.showMessageDialog(db1,a.getMessage());
		}
		
		
		
	}

}
