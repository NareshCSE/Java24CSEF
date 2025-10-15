package basicprogrames;

import java.util.Scanner;

public class Exp9FibonacciPrime {
	


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);  // Create Scanner object

	        System.out.print("Enter the value of n: ");

	        int n = sc.nextInt();  // Take input from keyboard



	        System.out.println("Numbers that are both Prime and Fibonacci up to " + n + ":");

	        for (int i = 1; i <= n; i++) {

	            if (isPrime(i) && isFibonacci(i)) {

	                System.out.print(i + " ");

	            }

	        }



	        sc.close();  // Close scanner

	    }



	    static boolean isPrime(int num) {

	        if (num < 2) return false;

	        for (int i = 2; i <= Math.sqrt(num); i++) {

	            if (num % i == 0) return false;

	        }

	        return true;

	    }



	    static boolean isFibonacci(int num) {

	        int a = 0, b = 1;

	        while (b <= num) {

	            if (b == num) return true;

	            int temp = b;

	            b = a + b;

	            a = temp;

	        }

	        return false;

	    }

	}


