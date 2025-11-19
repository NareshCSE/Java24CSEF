package javaproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountApp extends JFrame implements ActionListener{
 JTextArea ta=new JTextArea();
 JButton b=new JButton("Count");
 public CountApp(){
  add(new JScrollPane(ta));
  add(b,BorderLayout.SOUTH);
  b.addActionListener(this);
  setSize(300,300);
  setVisible(true);
  setDefaultCloseOperation(3);
 }
 public void actionPerformed(ActionEvent e){
  String t=ta.getText().trim();
  int chars=t.replace(" ","").length();               // removes spaces
  int words=t.isEmpty()?0:t.split("\\s+").length;
  JOptionPane.showMessageDialog(this,"Words: "+words+" | Chars: "+chars);
 }
 public static void main(String[]a){new CountApp();}
}
