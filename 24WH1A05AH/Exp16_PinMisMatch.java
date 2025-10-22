import java.util.*;

class PinMisMatch extends Exception{
	public PinMisMatch() {
		System.out.println("Excpetion Caught: Incorrect Pin. Please try again");
	}
}

public class Exp16_AtmPinException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int correctPin = 1234;
		int attempts = 0;
		System.out.print("Enter your name: ");
		String accHolderName=sc.next();
		
		while(attempts<3) { 
		System.out.print("Enter your pin: ");
		int pin = sc.nextInt();
		
		try {
			if(correctPin==pin) {
				System.out.println("Welcome " + accHolderName + "access granted!");
				break;
			}
			else {
				throw new PinMisMatch();
			}
		}	
		catch(PinMisMatch e){	
		}
		
		attempts++;
	    }
	
	    if(attempts==3) {
	    	System.out.println("Too many attempts.Sorry your account has been locked");
	    }
	    sc.close();
	}
}
