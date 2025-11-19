import javax.swing.*;
import java.awt.*; import java.awt.event.*;
public class Calc extends JFrame implements ActionListener{
 JTextField t=new JTextField(); double a,b; char o;
 public Calc(){
  JPanel p=new JPanel(new GridLayout(4,4));
  for(String s:"7 8 9 + 4 5 6 - 1 2 3 * 0 % = C".split(" ")){
   JButton b=new JButton(s); b.addActionListener(this); p.add(b);}
  add(t,"North"); add(p); setSize(250,300); setDefaultCloseOperation(3); setVisible(true);
 }
 public void actionPerformed(ActionEvent e){
  String s=e.getActionCommand();
  try{ if(s.matches("\\d")) t.setText(t.getText()+s);
   else if("+-*%".contains(s)){a=Double.parseDouble(t.getText()); o=s.charAt(0); t.setText("");}
   else if(s.equals("=")){b=Double.parseDouble(t.getText());
    t.setText(""+(o=='+'?a+b:o=='-'?a-b:o=='*'?a*b:a/b));}
   else t.setText("");} catch(Exception x){t.setText("Err");}
 }
 public static void main(String[]x){new Calc();}
}
