package javaprog;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string");
		String str=input.nextLine();
		
		StringBuilder reverse=new StringBuilder(str);
		reverse.reverse();
		
		if(str.equals(reverse.toString())) {
			System.out.println("String is Pallindrome");
		}else {
			System.out.println("String is not a Pallindrome");
		}
			
	}
}
