package exceptions;
import java.util.Scanner;

class PinMisMatchException extends Exception {
    public PinMisMatchException() {
        System.out.println("Sorry.. Your account has been locked");
    }
}

public class ATMPinValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accHolderName;
        int correctPin = 1234;
        int pinEntered;
        int attempts = 0;

        System.out.print("Enter Account Holder Name: ");
        accHolderName = sc.nextLine();

        while (attempts < 3) {
            System.out.print("Enter Your PIN: ");
            pinEntered = sc.nextInt();

            if (pinEntered == correctPin) {
                System.out.println("Welcome " + accHolderName + "!");
                System.out.println("PIN Validation Successful");
                sc.close();
                return;
            } else {
                attempts++;
                System.out.println("Incorrect PIN! Attempts left: " + (3 - attempts));
            }
        }

        try {
            throw new PinMisMatchException();
        } catch (PinMisMatchException e) {
            System.out.println(e.getMessage());
        }finally {
        	System.out.println("Exiting...");
        }

        sc.close();
    }
}

