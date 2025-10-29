package labprograms;
import java.util.Scanner;
class PinMisMatchException extends Exception{
	public PinMisMatchException(String message) {
		super(message);
	}
	
}
public class exp16 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Account Holder Name: ");
        String name = input.nextLine();
        final int actualPin=1234;
        int attempts=0;
        boolean success=false;
        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = input.nextInt();

            if (enteredPin == actualPin) {
                System.out.println("Welcome " + name + "! Access Granted ");
                success = true;
                break;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect PIN. Try again. (" + (3 - attempts) + " attempts left)");
                }
            }
        }
        if (!success) {
            try {
                throw new PinMisMatchException("Sorry..Your Account Has been Locked");
            } catch (PinMisMatchException e) {
                System.out.println(e.getMessage());
            }
        }

        input.close();
	}
   
}
