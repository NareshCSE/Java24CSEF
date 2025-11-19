package javaPrograms;
import javax.swing.*;
import java.awt.event.*;
public class DivideCompute {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Factorial Calculator");
	        frame.setSize(600, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JLabel labelInput = new JLabel("Number 1:");
	        labelInput.setBounds(30, 30, 100, 30);
	        frame.add(labelInput);
	        JTextField textInput = new JTextField();
	        textInput.setBounds(100, 30, 150, 30);
	        frame.add(textInput);
	        JLabel labelInput2 = new JLabel("Number 2:");
	        labelInput2.setBounds(300, 30, 100, 30);
	        frame.add(labelInput2);
	        JTextField textInput2 = new JTextField();
	        textInput2.setBounds(370, 30, 150, 30);
	        frame.add(textInput2);
	        JLabel labelResult = new JLabel("Result:");
	        labelResult.setBounds(150, 90, 150, 30);
	        frame.add(labelResult);
	        JTextField textResult = new JTextField();
	        textResult.setBounds(200, 90, 150, 30);
	        textResult.setEditable(false);
	        frame.add(textResult); 
	        JButton btnCompute = new JButton("Divide");
	        btnCompute.setBounds(200, 150, 150, 40);
	        frame.add(btnCompute);
	        btnCompute.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    int n1 = Integer.parseInt(textInput.getText());
	                    int n2 = Integer.parseInt(textInput2.getText());
	                    int res;
	                    res = n1 / n2;
	                    textResult.setText(String.valueOf(res));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame,
	                            "Please enter a valid integer!",
	                            "Invalid Input",
	                            JOptionPane.ERROR_MESSAGE);
	                } catch (ArithmeticException ex) {
	                    JOptionPane.showMessageDialog(frame,
	                            "Cannot divide by Zero!",
	                            "Invalid Input",
	                            JOptionPane.ERROR_MESSAGE);
	                }
	            }    
	        });
	        
	        frame.setVisible(true);

	}

}
