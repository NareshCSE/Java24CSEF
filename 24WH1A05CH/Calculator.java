import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int number1, number2;
		System.out.print("Enter an operator:");
		Scanner myObj = new Scanner(System.in);
		char operator = myObj.next().charAt(0);
		System.out.println("Enter the two numbers:");
		number1 = myObj.nextInt();
		number2 = myObj.nextInt();
		myObj.close();
		switch (operator) {
		case '+': {
			System.out.print("Addition is " + (number1 + number2));
			break;

		}
		case '-': {
			System.out.print("Subtraction is " + (number1 - number2));
			break;
		}
		case '*': {
			System.out.print("Multiplication is " + (number1 * number2));
			break;
		}
		case '/': {
			if (number2 == 0) {
				System.out.print("Invalid operation");
				break;
			}
			System.out.print("Division is " + ((float)number1 / number2));
			break;*
		}
		default: {
			System.out.print("Invalid operator");
		}
		}

	}
}
