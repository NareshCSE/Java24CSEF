package labprograms;
class CreditsNotSufficientException extends Exception {
    public CreditsNotSufficientException(String message) {
        super(message);
    }
}

public class exp15 {
    public static void checkCredits(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Credits not sufficient! Minimum required: 50");
        } else {
            System.out.println("Credits are sufficient: " + credits);
        }
    }
    public static void studentPortalCheck(int credits) throws CreditsNotSufficientException {
        System.out.println("\nChecking from Student Portal...");
        checkCredits(credits);
    }
    public static void adminPortalCheck(int credits) throws CreditsNotSufficientException {
        System.out.println("\nChecking from Admin Portal...");
        checkCredits(credits);
    }
    public static void main(String[] args) {
        try {
            studentPortalCheck(40);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
    
            adminPortalCheck(70);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\nProgram continues normally...");
    }
}
