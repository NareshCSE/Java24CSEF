package javalab1;
import java.util.Scanner;
class CreditsNotSufficientException extends RuntimeException{
	public CreditsNotSufficientException(String message) {
		super(message);
	}
}
public class credits {
	public static void checkCredits(int credits) {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Credits (" + credits + ") are less than 50");
        }
        System.out.println("Credits are sufficient: " + credits);
    }

    public static void callerMethod1(int credits) {
        try {
            checkCredits(credits);
            System.out.println("Caller Method 1: Success");
        } catch (CreditsNotSufficientException e) {
            System.out.println("Caller Method 1 caught exception: " + e.getMessage());
        }
    }
    
    public static void callerMethod2(int credits) {
    	try {
    		checkCredits(credits);
            System.out.println("Caller Method 2: Success");
        } catch (CreditsNotSufficientException e) {
            System.out.println("Caller Method 2 caught exception: " + e.getMessage());
        }
    }

    public static void callerMethod3(int credits) {
        callerMethod2(credits);
        System.out.println("Caller Method 3: Finished calling callerMethod2");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of credits to test: ");
        int credits = scanner.nextInt();

        System.out.println("\nTesting with credits = " + credits);
        callerMethod1(credits);
        callerMethod2(credits);
        callerMethod3(credits);

        scanner.close();
        }
    }


