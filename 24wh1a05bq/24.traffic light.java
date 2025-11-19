package javaproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Light extends JFrame implements ActionListener{
 JLabel msg=new JLabel("");
 JRadioButton r=new JRadioButton("Red"),
 y=new JRadioButton("Yellow"), g=new JRadioButton("Green");
 public Light(){
  setLayout(new FlowLayout());
  ButtonGroup bg=new ButtonGroup(); bg.add(r); bg.add(y); bg.add(g);
  add(msg); add(r); add(y); add(g);
  r.addActionListener(this);
  y.addActionListener(this);
  g.addActionListener(this);
  setSize(200,150); setVisible(true); setDefaultCloseOperation(3);
 }
 public void actionPerformed(ActionEvent e){
  if(r.isSelected()){msg.setText("STOP");
  msg.setForeground(Color.red);}
  else if(y.isSelected()){msg.setText("READY"); msg.setForeground(Color.orange);}
  else{msg.setText("GO"); msg.setForeground(Color.green);}
 }
 public static void main(String[]a){new Light();}
}
