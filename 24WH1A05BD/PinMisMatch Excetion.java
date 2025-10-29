package add;
import java.util.Scanner;
class PinMisMatchException extends Exception {
    public PinMisMatchException(String message) {
        super(message);
    }
}
public class ass16 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     final int CORRECT_PIN = 1234;
     System.out.print("Enter Account Holder Name: ");
     String name = scanner.nextLine();
     int attempts = 0;
     boolean accessGranted = false;
     while (attempts < 3) {
         System.out.print("Enter your 4-digit PIN: ");
         int enteredPin = scanner.nextInt();

         if (enteredPin == CORRECT_PIN) {
             System.out.println("Welcome, " + name + "! Access granted.");
             accessGranted = true;
             break;
         } else {
             System.out.println("Incorrect PIN. Try again.");
             attempts++;
         }
     }
     if (!accessGranted) {
         try {
             throw new PinMisMatchException("Sorry..Your Account Has been Locked");
         } catch (PinMisMatchException e) {
             System.out.println(e.getMessage());
         }
     }
     scanner.close();
}
}
