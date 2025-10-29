package labprograms;
import java.util.Scanner;
class Bank {
 int balance = 0;
 int getBalance() {
     return balance;
 }
 void deposit(int amount) {
     balance += amount;
     System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
 }
 void withdraw(int amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
     } else {
         System.out.println("Insufficient Balance!");
     }
 }
}
class BankA extends Bank {
 BankA() { balance = 1000; }
}
class BankB extends Bank {
 BankB() { balance = 1500; }
}
class BankC extends Bank {
 BankC() { balance = 2000; }
}

public class exp10 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     BankA bankA = new BankA();
     BankB bankB = new BankB();
     BankC bankC = new BankC();

     // ✅ Fixed Output
     System.out.println("=== Fixed Bank Balances ===");
     System.out.println("Balance in Bank A: $" + bankA.getBalance());
     System.out.println("Balance in Bank B: $" + bankB.getBalance());
     System.out.println("Balance in Bank C: $" + bankC.getBalance());
     System.out.println("\n=== Choose a Bank (A/B/C) ===");
     char choice = sc.next().toUpperCase().charAt(0);

     Bank selectedBank = null;
     switch(choice) {
         case 'A': selectedBank = bankA; break;
         case 'B': selectedBank = bankB; break;
         case 'C': selectedBank = bankC; break;
         default:
             System.out.println("Invalid Bank Choice!");
             sc.close();
             return;
     }

     System.out.println("Selected Bank Balance: $" + selectedBank.getBalance());
     System.out.println("\nChoose Operation: 1. Deposit  2. Withdraw");
     int op = sc.nextInt();
     System.out.print("Enter Amount: ");
     int amount = sc.nextInt();
     if (op == 1) {
         selectedBank.deposit(amount);
     } else if (op == 2) {
         selectedBank.withdraw(amount);
     } else {
         System.out.println("Invalid Operation!");
     }

     sc.close();
 }
}

