package javaPrograms;
import java.util.Scanner;
class PinMisMatchException extends RuntimeException {
    public PinMisMatchException(String s) {
        super(s);
    }
}
public class AtmPin {
    static int Pin = 1234;
    public int checkPin(int pin, int attemptCount) {
        if (pin != Pin) {
            if (attemptCount == 3) {
                throw new PinMisMatchException("Sorry..Your Account Has been Locked");
            } 
            else{
                System.out.println("Wrong Pin..Try Again.");
                return attemptCount;
            }
        } 
        else{
            System.out.println("Pin matched. Access Granted!");
            return 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtmPin atm = new AtmPin();
        int count = 1;
        while (count <= 3) {
            System.out.print("Enter the PIN: ");
            int pin = sc.nextInt();
            count = atm.checkPin(pin, count);
            count += 1;
        }    
    }
}
