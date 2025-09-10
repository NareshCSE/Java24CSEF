package projects;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);

		        // Input string
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        // Convert to lowercase (optional, for case-insensitive check)
		        str = str.toLowerCase();

		        // Reverse string manually using String only
		        String rev = "";
		        for (int i = str.length() - 1; i >= 0; i--) {
		            rev = rev + str.charAt(i);
		        }

		        // Compare original and reversed
		        if (str.equals(rev)) {
		            System.out.println("The given string is a Palindrome.");
		        } else {
		            System.out.println("The given string is NOT a Palindrome.");
		        }

		        sc.close();
		    }
		

	}


