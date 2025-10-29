package javaprog;
import java.util.*;

class PinMisMatchException extends RuntimeException{
	PinMisMatchException(String message){
		super(message);
	}
}
public class exp_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String accHolder=sc.next();
		int pin=1234;
		int enteredPin;
		int attempts=0;
		while(attempts<3) {
			System.out.print("Enter your pin:");
			enteredPin=sc.nextInt();
			if(enteredPin==pin) {
				System.out.println("Welcome to your bank account");
				return;
			}
			else {
				attempts++;
				if(attempts<3) {
					System.out.println("Invalid password! Try again.");
				}
			}
		}
		throw new PinMisMatchException("Your Account has been Blocked");

	}

}
