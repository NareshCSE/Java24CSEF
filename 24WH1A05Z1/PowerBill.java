package assignment1;
import java.util.Scanner;

public class CurrentBill {
	
	public static void main(String[] args) {
		int charges = 0;
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter number of units consumed:");
		int units = scanner.nextInt();
		scanner.close();
		if(units <= 50)   {
			charges = units * 1;
		}else if( 50 < units && units  <= 100) {
			charges = 50 + (units - 50) * 2;
		}else if( 100 < units && units <= 200) {
			charges = 50 + 50 * 2 + (units - 100) * 3;
		}else if( 200 < units && units <= 400) {
			charges = 50 + 50 * 2 + 100 * 3 + (units - 200) * 4;
		}else{
			charges = 50 + 50 * 2 + 100 * 3 + 200 * 4 + (units - 400) * 5;
		}
		System.out.println("The charges applied are " + charges);
	}
}
