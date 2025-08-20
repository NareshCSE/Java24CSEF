import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		System.out.println("Enter the operator('+','-','*','/'):");
		char operator=sc.next().charAt(0);
		double result=0;
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(result);
			break;
		}
		
	}

}
