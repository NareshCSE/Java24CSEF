package assignment_problems;

import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter a string:");
        str = scanner.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        String reversestr = str1.reverse().toString();

        if(str.equals(reversestr)){
        	System.out.println("given string is a palindrome");
        }
        else {
        	System.out.println("string is not a palindrome");
        }
        

	}

}
