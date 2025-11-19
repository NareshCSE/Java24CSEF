package calculator;
import java.awt.*;
import java.awt.event.*;





public class Calculator implements ActionListener{
   Frame frame;
   TextField display;
   Button[] numberButtons=new Button[10];
   Button add,sub,mul,div,mod,eq,clr;
   double num1,num2,result=0;
   char operator;
   
   
	class Calculator() {
    	farme=new Frame("Simple  Calculator");
    	frame.setSize(300,400);
    	frame.setLayout(new BorderLayout());
    	display=new TextField();
    	display.setEditable(false);
    	frame.add(display,BorderLayout.NORTH);
    	Panel panel=new Panel();
    	panel.setLayout(new GridLayout(5,4,5,5));
    	for(int i=0;i<10;i++) {
    		numberButtons[i]=new Button(string.valueOf(i));
    		numberButtons[i].addActionListener(this);
    	}
    	add=new Button("+");
    	sub=new Button("-");
    	mul=new Button("*");
    	div=new Button("/");
    	mod=new Button("%");
    	eq=new Button("=");
    	clr=new Button("C");
    	panel.add(numberButtons[7]);
    	panel.add(numberButtons[8]);
    	panel.add(numberButtons[9]);
    	panel.add(add);
    	panel.add(numberButtons[4]);
    	panel.add(numberButtons[5]);
    	panel.add(numberButtons[6]);
    	panel.add(sub);
    	panel.add(numberButtons[1]);
    	panel.add(numberButtons[2]);
    	panel.add(numberButtons[3]);
    	panel.add(mul);
    	panel.add(numberButtons[0]);
    	panel.add(div);
    	panel.add(eq);
    	panel.add(clr);
    	frame.add(panel,BorderLayout.CENTER);
    	
    	
    	
    	
    	
    	
    	
    	
    }
    public void actionPerformrd(ActionEvent e) {
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        new Calculator();
	}

}
