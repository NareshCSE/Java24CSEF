package javaPrograms;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    static double num1 = 0;
    static double num2 = 0;
    static String operator = "";

    public static void main(String[] args) {

        Frame frame = new Frame("Calculator");
        frame.setSize(500, 800);
        frame.setLayout(null);

        TextField display = new TextField();
        display.setBounds(50, 80, 400, 80);
        frame.add(display);

        ActionListener numberClick = e -> {
            Button b = (Button) e.getSource();
            display.setText(display.getText() + b.getLabel());
        };

        Button b1 = new Button("1");  
        b1.setBounds(50, 200, 100, 100);  
        b1.addActionListener(numberClick);
        Button b2 = new Button("2");  
        b2.setBounds(150, 200, 100, 100); 
        b2.addActionListener(numberClick);
        Button b3 = new Button("3");  
        b3.setBounds(250, 200, 100, 100); 
        b3.addActionListener(numberClick);
        Button bAdd = new Button("+"); 
        bAdd.setBounds(350, 200, 100, 100);

        Button b4 = new Button("4");  
        b4.setBounds(50, 300, 100, 100);  
        b4.addActionListener(numberClick);
        Button b5 = new Button("5");  
        b5.setBounds(150, 300, 100, 100); 
        b5.addActionListener(numberClick);
        Button b6 = new Button("6");  
        b6.setBounds(250, 300, 100, 100); 
        b6.addActionListener(numberClick);
        Button bSub = new Button("-"); 
        bSub.setBounds(350, 300, 100, 100);

        Button b7 = new Button("7");  
        b7.setBounds(50, 400, 100, 100);  
        b7.addActionListener(numberClick);
        Button b8 = new Button("8");  
        b8.setBounds(150, 400, 100, 100); 
        b8.addActionListener(numberClick);
        Button b9 = new Button("9");  
        b9.setBounds(250, 400, 100, 100); 
        b9.addActionListener(numberClick);
        Button bMul = new Button("*"); 
        bMul.setBounds(350, 400, 100, 100);

        Button b0 = new Button("0");
        b0.setBounds(50, 500, 100, 100); 
        b0.addActionListener(numberClick);
        Button bClr = new Button("Clear"); 
        bClr.setBounds(150, 500, 100, 100);
        Button bEq = new Button("="); 
        bEq.setBounds(250, 500, 100, 100);
        Button bDiv = new Button("/"); 
        bDiv.setBounds(350, 500, 100, 100);

        frame.add(b1); 
        frame.add(b2); 
        frame.add(b3); 
        frame.add(bAdd);
        frame.add(b4); 
        frame.add(b5); 
        frame.add(b6); 
        frame.add(bSub);
        frame.add(b7); 
        frame.add(b8); 
        frame.add(b9); 
        frame.add(bMul);
        frame.add(b0); 
        frame.add(bClr); 
        frame.add(bEq); 
        frame.add(bDiv);

        bAdd.addActionListener(e -> storeFirstNumber(display, "+"));
        bSub.addActionListener(e -> storeFirstNumber(display, "-"));
        bMul.addActionListener(e -> storeFirstNumber(display, "*"));
        bDiv.addActionListener(e -> storeFirstNumber(display, "/"));

        bEq.addActionListener(e -> {
            try {
                num2 = Double.parseDouble(display.getText());

                double result = 0;
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num1 / num2; break;
                }

                display.setText(String.valueOf(result));
            } catch (Exception ex) {
                display.setText("Error");
            }
        });
        bClr.addActionListener(e -> display.setText(""));

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public static void storeFirstNumber(TextField display, String op) {
        try {
            num1 = Double.parseDouble(display.getText());
            operator = op;
            display.setText("");
        } catch (Exception e) {
            display.setText("Error");
        }
    }
}
