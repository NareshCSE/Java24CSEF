package az;
import java.util.*;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		StringBuffer isword = new StringBuffer(word);
		String compare = isword.reverse().toString();
		if(word.equals(compare))
		{
			System.out.println("It is palindrome");
		}
		else 
		{
			System.out.println("It is not palindrome");	
		}
	}
}

