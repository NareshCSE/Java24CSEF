package intro;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String palindrome = "";
		
		for(int i=0;i<s.length();i++) {
			palindrome+=s.charAt(i);
		}
		if(s.equals(palindrome)) {
			System.out.println("string is a palindrome");
		} else {
			System.out.println("string is not a palindrome");
		}
		sc.close();

	}

}
