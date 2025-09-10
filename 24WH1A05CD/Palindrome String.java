package javalab;

import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String");
		String str1=sc.next();
		
		String str = str1.toLowerCase();
		
		String str2= new StringBuilder(str).reverse().toString();
		
		if(str.equals(str2)) {
			System.out.println(str1 + " is a palindrome");
		}
		else {
			System.out.println(str1 + " is not a palindrome");
		}
		sc.close();
	}

}
