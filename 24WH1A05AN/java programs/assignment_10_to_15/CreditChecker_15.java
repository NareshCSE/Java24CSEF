// Custom Exception
package assignment_10_to_15;
class CreditsNotSufficientException extends Exception {
    public CreditsNotSufficientException(String message) {
        super(message);
    }
}

public class CreditChecker_15 {

    // Method 1: checks credits for a student
    public static void checkCreditsStudent(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Student credits are less than 50: " + credits);
        }
        System.out.println("Student credits are sufficient: " + credits);
    }

    // Method 2: checks credits for a course
    public static void checkCreditsCourse(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Course credits are less than 50: " + credits);
        }
        System.out.println("Course credits are sufficient: " + credits);
    }

    // Method 3: checks credits for registration
    public static void checkCreditsRegistration(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Registration credits are less than 50: " + credits);
        }
        System.out.println("Registration credits are sufficient: " + credits);
    }

    public static void main(String[] args) {
        int[] testCredits = { 60, 40, 55 };

        // Using different caller methods and handling exceptions
        for (int credits : testCredits) {
            try {
                checkCreditsStudent(credits);
            } catch (CreditsNotSufficientException e) {
                System.out.println("Handled in Student check: " + e.getMessage());
            }

            try {
                checkCreditsCourse(credits);
            } catch (CreditsNotSufficientException e) {
                System.out.println("Handled in Course check: " + e.getMessage());
            }

            try {
                checkCreditsRegistration(credits);
            } catch (CreditsNotSufficientException e) {
                System.out.println("Handled in Registration check: " + e.getMessage());
            }

            System.out.println("---");
        }
    }
}