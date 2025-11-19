package javaproject;
import javax.swing.*; import java.awt.event.*;
public class Fact extends JFrame implements ActionListener{
 JTextField in=new JTextField(), out=new JTextField();
 public Fact(){
  setLayout(null);
  in.setBounds(20,20,150,30); out.setBounds(20,60,150,30);
  JButton b=new JButton("Compute"); b.setBounds(20,100,150,30); b.addActionListener(this);
  add(in); add(out); add(b);
  setSize(200,200); setVisible(true); setDefaultCloseOperation(3);
 }
 public void actionPerformed(ActionEvent e){
  try{int n=Integer.parseInt(in.getText()), f=1; for(int i=1;i<=n;i++) f*=i; out.setText(""+f);}
  catch(Exception x){out.setText("Error");}
 }
 public static void main(String[]a){new Fact();}
}
