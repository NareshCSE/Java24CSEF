package java2025;
import java.util.Scanner;
class Bank {
    int balance;
    Bank(int balance) {
        this.balance = balance;
    }
    int getBalance() {
        return balance;
    }
}
class BankA extends Bank {
    BankA(int balance) {
        super(balance);
    }
}
class BankB extends Bank 
    BankB(int balance) {
        super(balance);
    }
}
class BankC extends Bank {
    BankC(int balance) {
        super(balance);
    }
}
public class Ass10 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter balance for Bank A: ");
	        int balA = sc.nextInt();
	        System.out.print("Enter balance for Bank B: ");
	        int balB = sc.nextInt();
	        System.out.print("Enter balance for Bank C: ");
	        int balC = sc.nextInt();
	        BankA a = new BankA(balA);
	        BankB b = new BankB(balB);
	        BankC c = new BankC(balC);
	        System.out.println("\n--- Bank Balances ---");
	        System.out.println("Bank A: $" + a.getBalance());
	        System.out.println("Bank B: $" + b.getBalance());
	        System.out.println("Bank C: $" + c.getBalance());
	        sc.close();
	}
}
