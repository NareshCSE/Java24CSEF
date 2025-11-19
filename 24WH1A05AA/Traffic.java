package standAlone;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Traffic extends JFrame implements ActionListener{

	static JLabel jl1;
	static JRadioButton rb1,rb2,rb3;
	static JTextField t1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame();
		jf.setTitle("Traffic Lights");
		jf.setSize(500,500);
		jf.setLayout(new GridLayout(7,1));
		
		
		
		jl1 =new JLabel("Choose:");
		jl1.setVisible(true);
		jf.add(jl1);
		
	
		t1 =new JTextField();
		t1.setEditable(true);
		t1.setVisible(true);
		jf.add(t1);
		
		
		
		rb1=new JRadioButton("RED");
		rb1.setVisible(true);
		jf.add(rb1);
		
		rb2=new JRadioButton("yellow");
		rb2.setVisible(true);
		jf.add(rb2);
		
		rb3=new JRadioButton("Green");
		rb3.setVisible(true);
		jf.add(rb3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		
		Traffic tf= new Traffic();
		rb1.addActionListener(tf);
		rb2.addActionListener(tf);
		rb3.addActionListener(tf);
		
		jf.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(rb1.isSelected()) {
			t1.setText("STOP");
			
		}else if(rb2.isSelected()) {
			t1.setText("WAIT");
		}else{
			if(rb3.isSelected()) {
		}
			t1.setText("GO");
		}
	}

}
