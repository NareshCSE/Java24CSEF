package clas;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();	
		System.out.println("Enter the second number:");
		int num2=sc. nextInt();
		System.out.println("Enter the operator('+','-','*','/')");
		char operator=sc.next().charAt(0);
		double result=0;
	    switch(operator) { 
	    case ('+'):
	         result=num1+num2;
	         System.out.println(result);
	         break;
	    case ('-'):
	         result=num1-num2;
	         System.out.println(result);
	         break;
	    case ('*'):
	         result=num1*num2;
	         System.out.println(result);
	         break;
	    case ('/'):
	         result=num1/num2;
	         System.out.println(result);
	         break;
	                  
	                  
	             
	         }
					
			
		
		

	}

}
