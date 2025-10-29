package add;

import java.util.Scanner;

interface Bank {
	void createAccount(String name);

	void creditAmount(double amount);

	void debitAmount(double amount);

	void transferAmount(String toAccount, double amount);

	void miniStatement();

	double getRateOfInterest();
}

class SBI implements Bank {
	public void createAccount(String name) {
		System.out.println("SBI Account created for " + name);
	}

	public void creditAmount(double amount) {
		System.out.println("SBI credited: $" + amount);
	}

	public void debitAmount(double amount) {
		System.out.println("SBI debited: $" + amount);
	}

	public void transferAmount(String toAccount, double amount) {
		System.out.println("SBI transferred $" + amount + " to " + toAccount);
	}

	public void miniStatement() {
		System.out.println("SBI Mini Statement");
	}

	public double getRateOfInterest() {
		return 6.5;
	}
}

class Axis implements Bank {
	public void createAccount(String name) {
		System.out.println("Axis Account created for " + name);
	}

	public void creditAmount(double amount) {
		System.out.println("Axis credited: $" + amount);
	}

	public void debitAmount(double amount) {
		System.out.println("Axis debited: $" + amount);
	}

	public void transferAmount(String toAccount, double amount) {
		System.out.println("Axis transferred $" + amount + " to " + toAccount);
	}

	public void miniStatement() {
		System.out.println("Axis Mini Statement");
	}

	public double getRateOfInterest() {
		return 7.0;
	}
}

public class ass12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b;
		System.out.println("Choose Bank: 1. SBI  2. Axis");
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1) {
			b = new SBI();
		} else {

			b = new Axis();
		}
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		b.createAccount(name);
		System.out.print("Enter amount to credit: ");
		double credit = sc.nextDouble();
		b.creditAmount(credit);
		System.out.print("Enter amount to debit: ");
		double debit = sc.nextDouble();
		b.debitAmount(debit);
		sc.nextLine();
		System.out.print("Enter recipient account name for transfer: ");
		String toAcc = sc.nextLine();
		System.out.print("Enter amount to transfer: ");
		double transfer = sc.nextDouble();
		b.transferAmount(toAcc, transfer);
		System.out.println();
		b.miniStatement();
		System.out.println("Rate of Interest: " + b.getRateOfInterest() + "%");
		sc.close();
	}
}
