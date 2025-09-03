package Labproblems;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        double num1=scanner.nextInt();
        System.out.println("enter a number:");
        double num2=scanner.nextInt();
        System.out.println("enter choice(+,-,*,/):");
        char choice=scanner.next().charAt(0); 
       double result;       
        switch(choice) {
        case '+':
        	result=(num1+num2);
        	System.out.println("sum is:"+result);
        	break;
        case '-':
        	result=(num1-num2);
        	System.out.println("difference is:"+result);
        	break;
        case '*':
        	result=num1*num2;
        	System.out.println("product is:"+result);
        	break;
        case '/':
        	result=num1/num2;
        	System.out.println("division is:"+result);
        break;
        }
        scanner.close();
	}

}
