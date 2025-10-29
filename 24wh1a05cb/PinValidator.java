package demo;
import java.util.Scanner;
	class PinMisMatchException extends RuntimeException{
		PinMisMatchException(String message){
			super(message);
		}
	}
	public class PinValidator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String name;
			System.out.println("Enter your name:");
			name=sc.next();
			int pinNo;
			System.out.println("Enter your actuall pin to set:");
			pinNo=sc.nextInt();
			int cnt=0;
			int trial;
			try {
			    while(cnt < 3) {
				  System.out.println("Enter pinNo:");
				  trial=sc.nextInt();
				  if(trial==pinNo) {
					 System.out.println("Correct pin number.");
					 return;
				  }
				  cnt++;
		
			    }
			    throw new PinMisMatchException("Sorry....\n"+"Your account Locked.");
			}catch (PinMisMatchException e) {
				System.out.println(e.getMessage());
			}
		

		}

	}
