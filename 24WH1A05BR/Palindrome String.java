package datatypes;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
				        Scanner sc = new Scanner(System.in);

		        // Input from user
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        // Normalize input (ignore case and spaces)
		        String str = input.replaceAll("\\s+", "").toLowerCase();

		        // Reverse manually using String concatenation
		        String reversed = "";
		        for (int i = str.length() - 1; i >= 0; i--) {
		            reversed = reversed + str.charAt(i);
		        }

		        // Check palindrome
		        if (str.equals(reversed)) {
		            System.out.println("\"" + input + "\" is a Palindrome.");
		        } else {
		            System.out.println("\"" + input + "\" is NOT a Palindrome.");
		        }

		        sc.close();
		    }
		

		

	}


