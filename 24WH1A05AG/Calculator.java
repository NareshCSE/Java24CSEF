import java.util.Scanner;

public class Week1_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=sc.nextInt();
		System.out.print("Enter the operator:");
		char o=sc.next().charAt(0);
		System.out.print("Enter second number:");
		int b=sc.nextInt();
		int r=0;
		switch (o)
		{
		case '+':
			r=a+b;
			break;
		case '-':
			r=a-b;
			break;
		case '*':
			r=a*b;
			break;
		case '/':
			r=a/b;
			break;
		default:
			System.out.print("invald input");
		}
		System.out.println("Result: " + r );
		sc.close();
			
			
	}

}
