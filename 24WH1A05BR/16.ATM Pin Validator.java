package labprograms;
import java.util.Scanner;


class PinMisMatchException extends Exception {
    public PinMisMatchException(String message) {
        super(message);
    }
}

public class ATMPinValidator {

    public static void main(String[] args) throws PinMisMatchException {
        Scanner sc = new Scanner(System.in);

        String accHolder;
        int correctPin = 1234; 
        int enteredPin;
        int attempts = 0;

        System.out.print("Enter Account Holder Name: ");
        accHolder = sc.nextLine();

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Welcome, " + accHolder + " Access Granted.");
                sc.close();
                return;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect PIN. Try again (" + (3 - attempts) + " attempts left).");
                }
            }
        }

        sc.close();

        throw new PinMisMatchException("Sorry.. Your Account Has Been Locked");
    }
}
