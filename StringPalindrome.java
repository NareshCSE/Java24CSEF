package arrays;
import java.util.Scanner;
import java.lang.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String string1=sc.nextLine();
		String string2 = new StringBuilder(string1).reverse().toString();
		if(string1.equals(string2)) {
			System.out.println(string1+" is a String Palindrome");
		}
		else {
			System.out.println(string1+" is not a String Palindrome");
		}
		
		

	}

}