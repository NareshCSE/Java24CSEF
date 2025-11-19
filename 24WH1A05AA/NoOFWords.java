package standAlone;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NoOFWords extends JFrame implements ActionListener{

	static JLabel enter,l1,l2;
	static JTextField display,noWords,noChar;
	static JButton compute;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setTitle("Traffic Lights");
		jf.setSize(500,500);
		jf.setLayout(new GridLayout(7,1));
		
		enter= new JLabel("Enter the text");
		enter.setVisible(true);
		jf.add(enter);
		
		display =new JTextField();
		display.setEditable(true);
		display.setVisible(true);
		jf.add(display);
		
		
		
		
		l1= new JLabel("NO of words");
		l1.setVisible(true);
		jf.add(l1);
		
		noWords =new JTextField();
		noWords.setEditable(false);
		noWords.setVisible(true);
		jf.add(noWords);
		
		
		l2= new JLabel("NO of characters");
		l2.setVisible(true);
		jf.add(l2);
		
		
		
		noChar =new JTextField();
		noChar.setEditable(false);
		noChar.setVisible(true);
		jf.add(noChar);
		
		compute = new JButton("Calculate");
		compute.setBounds(140,250,100,30);
		compute.setVisible(true);
		jf.add(compute);
		
		NoOFWords fa = new NoOFWords();
        compute.addActionListener(fa);
		
		
		
		jf.setVisible(true);
		
		
		
		
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s = display.getText();
		
        int charCount = s.length();
        
        noChar.setText(String.valueOf(charCount));
        
        String[] words=s.split(" ");
        
        int wordCount=words.length;
        
        noWords.setText(String.valueOf(wordCount));
        

        
       
		
		
		
		
	}

}
