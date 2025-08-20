package assignment1;
import java.util.Scanner;

public class Caluculator {

	public static void main(String[] args) {
		System.out.println("Available options:");
		System.out.println("0 - Addition");
		System.out.println("1 - Subtraction");
		System.out.println("2 - Multiplication");
		System.out.println("3 - Division");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice:");
		int choice  = sc.nextInt();
	    System.out.print("Enter first number:");
		int number1 = sc.nextInt();
	    System.out.print("Enter second number:");
		int number2 = sc.nextInt();
		sc.close();
		switch (choice) {
		    case 0: int addition = number1 + number2;
		    		System.out.println("Addition of " + number1 + " and " + number2 + " is " + addition);
		            break;
		    case 1: int subtraction = number1 - number2;
    				System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + subtraction);
		            break;
		    case 2: int multiplication = number1 * number2;
					System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + multiplication);
		            break;
		    case 3: int division = number1 / number2;
					System.out.println("Division of " + number1 + " and " + number2 + " is " + division);
		            break;
		    default:System.out.println("Invalid input.Enter valid input"); 
		};

	}

}
