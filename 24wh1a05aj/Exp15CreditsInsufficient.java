package basicprogrames;
import java.util.Scanner;

class CreditNotSufficient extends Exception {
    public CreditNotSufficient() {
        System.out.println("Exception Caught: Credits are not sufficient! Minimum required is 50.");
    }
}

public class Exp15CreditsNotSufficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your credits: ");
        int credits = sc.nextInt();

        try {
            if (credits < 50) {
                throw new CreditNotSufficient();
            } else {
                System.out.println("Credits are sufficient." );
            }
        } 
        catch (CreditNotSufficient e) {          
        } 
        
        sc.close();
    }
} 
