import java.util.Scanner;
class PinMismatchException extends RuntimeException{
	public PinMismatchException() {
		super();
	}
	
}
class AccountLockedException extends RuntimeException{
	public AccountLockedException() {
		super();
	}
}

public class atmPINvalidator {
 
	
		private static final int correct_pin=1234;
		public static void ValidatePin(int pin)throws PinMismatchException{
			if(pin!=correct_pin) {
				throw new PinMismatchException();
			}
		}
	
	
	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter account holder name:");
	 String name=scanner.nextLine();
	 int attempts=0;
	 boolean access=false;
	 while(attempts<3&&access!=true)
	 { System.out.println("Enter pin:");
	    int pin=scanner.nextInt();
		 try {
			 ValidatePin(pin);
			 System.out.println("Access granted");
			 access=true;
		 }catch(PinMismatchException e) {
			 attempts++;
			 System.out.println("Wrong pin.Try again.Attempts left:" + (3-attempts));
		 }
	 }
	 if(!access) {
		 System.out.println(name+" Your account is locked!");
		 throw new AccountLockedException();
	 }
		

	}

}
