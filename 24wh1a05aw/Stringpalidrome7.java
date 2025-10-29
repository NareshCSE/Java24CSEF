package csef5aw;
	import java.util.Scanner;
	public class StringPalindeome {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        
	        str = str.replaceAll("\\s+", "").toLowerCase();

	        
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed = reversed + str.charAt(i);
	        }

	        
	        if (str.equals(reversed)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        sc.close();

		}

	}


