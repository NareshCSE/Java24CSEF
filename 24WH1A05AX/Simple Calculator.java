package java1;

import java.util.Scanner;

public class Calculator {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);

		System.out.println("num1=");

		int number1=scanner.nextInt();

		System.out.println("num2=");

		int number2=scanner.nextInt();

		System.out.println("enter operator\n1.add\n2.subtract\n3.multiplication\n4.division");

		int operator=scanner.nextInt();

		switch(operator) {

		case 1:

			System.out.println(number1+number2);

			break;

		case 2:

			System.out.println(number1-number2);

			break;

		case 3:

			System.out.println(number1*number2);

			break;

		case 4:

			System.out.println(number1/number2);

			break;

		default:

			System.out.println("Invalid Operator");

		}



	}



}
