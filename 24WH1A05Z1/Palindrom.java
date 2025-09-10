package arrays;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("Enter string to check for palindrom:");
		String string = x.nextLine();
		
		x.close();
		
		String reverse = new StringBuilder(string).reverse().toString();
		if(string.equals(reverse)) {
			System.out.println(string+" is a palindrom");
		}
		else
			System.out.println(string+" is not a palindrom");
	}

}
