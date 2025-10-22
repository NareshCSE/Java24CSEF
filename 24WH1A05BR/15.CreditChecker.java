package labprograms;

class CreditsNotSufficientException extends RuntimeException {
    public CreditsNotSufficientException(String message) {
        super(message);
    }
}

public class CreditChecker {

    static void validateCredits(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Credits not sufficient.");
        } else {
            System.out.println("Credits are sufficient: " + credits);
        }
    }

 public static void main(String [] args) {
    	  System.out.println("Checking Credits"); 
    	  validateCredits(20);
    	  
    	   
       }
}


