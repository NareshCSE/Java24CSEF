package java_programs;

import java.util.Scanner;

class CreditNotFoundException extends RuntimeException{
	public CreditNotFoundException() {
		System.out.println("credits are not sufficient to write the exam");
	}
}
public class creditHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total credits: ");
		int credits = sc.nextInt();
		try {
			if(credits<50) {
				 throw new  CreditNotFoundException();
			}
			else {
				System.out.println("credits are sufficient to write the exam");
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
			sc.close();
		
	}

}
