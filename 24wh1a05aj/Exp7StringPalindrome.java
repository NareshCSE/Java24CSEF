package basicprogrames;
import java.util.Scanner;

public class Exp7StingPalindrome {



	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("enter a string");

		String str=input.nextLine();

		

		int result=isPalindrome(str);

		if(result==1) {

			System.out.println("String is Pallindrome");

		}

		else {

			System.out.println("String is not a Pallindrome");

		}



	}

	static int isPalindrome(String str) {

		

		//string to character array

		char[] charArray=str.toCharArray();

		

		

		//length of charArray

		int length=charArray.length;

		int size=length-1;

		for(int i=0;i<length-1;i++) {

		if(charArray[i]==charArray[size]) {

				size--;

			}else {

				return 0;

		}

		

		}

		return 1;

	}



}

