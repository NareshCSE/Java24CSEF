package java_programs;

import java.util.*;

class PinMisMatchException extends RuntimeException{
	public  PinMisMatchException(){
		System.out.println("Your account has been locked!!!!!");
	}
}

public class ATM_PinValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the Account Holder: ");
		String name = sc.nextLine();
		int pass = 2480;
		System.out.println("Enter ID of the Account Holder: ");
		int id = sc.nextInt();
		try {
			for(int i=0;i<3;i++) {
				System.out.println("Enter PIN: ");
				int pin = sc.nextInt();
				if(pin==pass) {
					System.out.println("You entered pin is correct!!..now,you can acess your account....");
					break;
				}
				else if(i<2 && pin!=pass) {
					System.out.println("pin is incorrect...try again!!");
				}
				else if(i<3 && pin!=pass) {
					throw new PinMisMatchException();
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
