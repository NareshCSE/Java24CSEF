package demo;
 
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scaneer= new Scanner(System.in) ;
		System.out.println("enter first number:");
		int num1= scaneer.nextInt();
		System.out.println("enter second number:");
		int num2=scaneer.nextInt();
		System.out.println("choose \n 1.addition\n2.subtraction\n3.multiplication\n4.divison\n5.remainder");
		int choice=scaneer.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("addition is:");
				System.out.println(num1+num2);
				break;
			case 2:
				System.out.println("subtraction is:");
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println("multiplication is:");
				System.out.println(num1*num2);
				break;
			case 4:
				 System.out.println("divison is:");
				 System.out.println(num1/num2);
				 break;
			case 5:
				System.out.println("rema;inder is:");
				System.out.println(num1%num2);
				break;
		}
		return;

	}

}
