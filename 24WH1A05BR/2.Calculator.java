package datatypes;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.println("Enter second number: ");
	        
	        int num2 = sc.nextInt();

	        System.out.println("Enter operation (add, subtract, multiply, divide): ");
	        String operation = sc.next().toLowerCase(); // lowercase for easy comparison

	        int result;

	        switch (operation) {
	            case "add":
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;

	            case "subtract":
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;

	            case "multiply":
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;

	            case "divide":
	                if (num2 != 0) {
	                    result = num1 / num2; // integer division 
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Division by zero!");
	                }
	                break;

	            default:
	                System.out.println("Invalid operation! Please enter add, subtract, multiply, or divide.");
	        }

	        sc.close();
	    }
	}
