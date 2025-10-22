import java.util.Scanner;

class CreditsNotSufficient extends Exception{
	public CreditsNotSufficient() {
		System.out.println("Exception Caught: Credits are not sufficient! Minimum required is 50.");
	}
}

public class Exp15_CreditsNotSufficient{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your credits:");
		int credits = sc.nextInt();
		
		try {
			if(credits < 50) {
				throw new CreditsNotSufficient();
			} else {
				System.out.println("Credits are Sufficient. ");
			}
		}
		catch (CreditsNotSufficient e) {		
		}
		
		sc.close();
	}
}
