import java.util.Scanner;

public class Simple_calci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num1 :");
		double num1 = sc.nextDouble();
		System.out.print("enter num2 :");
		double num2 = sc.nextDouble();
		System.out.print("Enter operators(+,-,*,/):");
		char Operator = sc.next().charAt(0);
		//double res;
		
		switch(Operator)
		{
		case '+' :
			System.out.print("addition of two numbers :"+(num1+num2));
			break;
		case '-' :
			System.out.print("subtraction of two numbers :"+(num1-num2));
			break;
		case '*' :
			System.out.print("multiplication of two numbers :"+(num1*num2));
			break;
		case '/' :
			System.out.print("division of two numbers :"+(num1/num2));
			break;
		}
		
	
	}
	

}
