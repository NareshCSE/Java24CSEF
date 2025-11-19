package javaproject;
import javax.swing.*; import java.awt.event.*;
public class Div extends JFrame implements ActionListener{
 JTextField n1=new JTextField(), n2=new JTextField(), r=new JTextField();
 public Div(){
  setLayout(null);
  n1.setBounds(20,20,120,30); n2.setBounds(20,60,120,30); r.setBounds(20,140,120,30);
  JButton b=new JButton("Divide"); b.setBounds(20,100,120,30); b.addActionListener(this);
  add(n1); add(n2); add(r); add(b);
  setSize(180,220); setVisible(true); setDefaultCloseOperation(3);
 }
 public void actionPerformed(ActionEvent e){
  try{
   int a=Integer.parseInt(n1.getText());
   int b=Integer.parseInt(n2.getText());
   r.setText(""+(a/b));
  }catch(NumberFormatException x){
   JOptionPane.showMessageDialog(this,"Enter integers only!");
  }catch(ArithmeticException x){
   JOptionPane.showMessageDialog(this,"Cannot divide by zero!");
  }
 }
 public static void main(String[]a){new Div();}
}
