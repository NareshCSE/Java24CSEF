package add;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String input=scanner.next();
		
		String str = input.toLowerCase().replaceAll("\\s+", "");
		
		StringBuilder sb=new StringBuilder(str);
		String reversed=sb.reverse().toString();
		
		if(str.equals(reversed)) {
			System.out.println("\"" + input + "\" is a Palindrome.");
		}
		else {
			System.out.println("\"" + input + "\" is Not  a Palindrome.");
			
		}
		
		
		scanner.close();
		

	}

}
