package projects;
import java.util.Scanner;
class PinMisMatchException extends RuntimeException{
	PinMisMatchException(){
		System.out.println("sorry your account has been locked");
	}
}
public class Pinvalidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String accountholder;
		int correctPin = 1234;
		int chances = 1;
		
		System.out.print("account holder name: ");
		accountholder = sc.next();
		
		while(chances <= 3) {
			System.out.print("enter the pin: ");
			int pin = sc.nextInt();
			if(pin == correctPin) {
				System.out.println("entered pin is correct");
				sc.close();
				break;
			}
			else {
				if(chances == 3) {
					throw new PinMisMatchException();
				}
				else {
					System.out.println("pin is incorrect, try again.");
			    }
		    }
			chances++;
		 }
	}
}
