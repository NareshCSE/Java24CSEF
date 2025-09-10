package javalab;
import java.util.Scanner;
public class pallindrome7 {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		String word=myObj.next();
		StringBuffer sbuffer=new StringBuffer();
		sbuffer.append(word);
		
		if(word.compareTo(sbuffer.reverse().toString())==0)
		{
			System.out.print("Given String is a pallindrome");
		}
		else
		{
			System.out.print("Given string is not a pallindrome");
		}
		
		 
	}

}
