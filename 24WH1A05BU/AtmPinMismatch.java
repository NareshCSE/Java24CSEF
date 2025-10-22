package Java;
import java.util.Scanner;
class pinMismatchException extends RuntimeException{
	public pinMismatchException(String msg) {super(msg);}
}
public class atmPin {

	public static void main(String[] args) throws pinMismatchException{
		Scanner sc=new Scanner(System.in);
		String accHolder;
		int pin_no,attempts=0;
		int correct_pin=2007;
		System.out.println("Enter Account holder's name: ");
		accHolder=sc.nextLine();
		while(attempts<3) {
			System.out.println("Enter the pin: ");
			pin_no=sc.nextInt();
			if(pin_no==correct_pin) {
				System.out.println("Access Granted");
				sc.close();
				return;
			}
			else {
				attempts++;
				System.out.println("Incorrect Pin!");
			}
		}
		sc.close();
		throw new pinMismatchException("Sorry your account is locked!");
		

	}

}
