package assignment_16_to_20;

import java.util.Scanner;

//Custom Exception Class
class PinMisMatchException extends Exception {
 public PinMisMatchException(String message) {
     super(message);
 }
}

//ATM PIN Validator Application
public class ATM_PIN_16 {
 private static final String CORRECT_PIN = "1234"; // Example correct PIN

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter Account Holder Name: ");
     String accHolder = scanner.nextLine();

     int attempts = 0;
     boolean authenticated = false;

     while (attempts < 3) {
         System.out.print("Enter PIN: ");
         String enteredPin = scanner.nextLine();

         try {
             if (!enteredPin.equals(CORRECT_PIN)) {
                 attempts++;
                 throw new PinMisMatchException("Incorrect PIN. Try again.");
             }
             authenticated = true;
             break;
         } catch (PinMisMatchException e) {
             System.out.println(e.getMessage());
         }
     }

     if (!authenticated) {
         try {
             throw new PinMisMatchException("Sorry..Your Account Has been Locked");
         } catch (PinMisMatchException e) {
             System.out.println(e.getMessage());
         }
     } else {
         System.out.println("Welcome " + accHolder + "! You have successfully logged in.");
     }

     scanner.close();
 }
}
