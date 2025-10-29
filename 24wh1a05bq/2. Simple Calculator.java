package projects;
import java.util.Scanner;
public class Calculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Calculator");
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Choose operation: +, -, *, /");
	        char op = scanner.next().charAt(0);

	        double result;

	        if (op == '+') {
	            result = num1 + num2;
	        } else if (op == '-') {
	            result = num1 - num2;
	        } else if (op == '*') {
	            result = num1 * num2;
	        } else if (op == '/') {
	            if (num2 == 0) {
	                System.out.println("Error! Division by zero.");
	                scanner.close();
	                return;
	            }
	            result = num1 / num2;
	        } else {
	            System.out.println("Invalid operator!");
	            scanner.close();
	            return;
	        }

	        System.out.println("Result: " + result);
	        scanner.close();
	    }
	}


