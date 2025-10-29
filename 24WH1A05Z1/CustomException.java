package exceptions;
import java.util.Scanner;

class CreditsNotSufficientException extends RuntimeException {
    CreditsNotSufficientException() {
        System.out.println("Credits are not sufficient");
    }
}

public class CustomException {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the no of credits: ");
        int credits = sc.nextInt();

        try {
            if (credits < 50)
                throw new CreditsNotSufficientException();
            else
                System.out.println("Credits are sufficient.");
        } 
        catch (CreditsNotSufficientException e) {
            System.out.println("Need more " + (50 - credits) + " credits to pass");
        }
        finally {
        	System.out.println("Exited");
        }
        sc.close();
    }
}