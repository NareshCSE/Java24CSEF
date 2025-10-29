package javaprog;

import java.util.*;

interface Bank {

    void createAccount(String accNumber, String accHolderName, double initialDeposit);

    void creditAmount(double amount);

    void debitAmount(double amount);

    void transferAmount(Bank targetBank, double amount);

    void miniStatement();

    double rateOfInterest(); // fixed rate of interest

}



// SBI Bank implementation

class SBI implements Bank {

    private String accNumber;

    private String accHolderName;

    private double balance;

    private final double INTEREST_RATE = 6.5; // SBI interest rate



    public void createAccount(String accNumber, String accHolderName, double initialDeposit) {

        this.accNumber = accNumber;

        this.accHolderName = accHolderName;

        this.balance = initialDeposit;

        System.out.println("✅ SBI Account created for " + accHolderName + " with balance $" + balance);

    }



    public void creditAmount(double amount) {

        balance += amount;

        System.out.println("💰 Credited $" + amount + " to SBI account. New balance: $" + balance);

    }



    public void debitAmount(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("💸 Debited $" + amount + " from SBI account. New balance: $" + balance);

        } else {

            System.out.println("⚠ Insufficient balance in SBI account!");

        }

    }



    public void transferAmount(Bank targetBank, double amount) {

        if (amount <= balance) {

            balance -= amount;

            targetBank.creditAmount(amount);

            System.out.println("🔁 Transferred $" + amount + " from SBI to target account.");

        } else {

            System.out.println("⚠ Insufficient balance for transfer in SBI account!");

        }

    }



    public void miniStatement() {

        System.out.println("📄 [SBI] Account Holder: " + accHolderName + " | Account No: " + accNumber + " | Balance: $" + balance);

    }



    public double rateOfInterest() {

        return INTEREST_RATE;

    }

}



// Axis Bank implementation

class Axis implements Bank {

    private String accNumber;

    private String accHolderName;

    private double balance;

    private final double INTEREST_RATE = 7.0; // Axis interest rate



    public void createAccount(String accNumber, String accHolderName, double initialDeposit) {

        this.accNumber = accNumber;

        this.accHolderName = accHolderName;

        this.balance = initialDeposit;

        System.out.println("✅ Axis Account created for " + accHolderName + " with balance $" + balance);

    }



    public void creditAmount(double amount) {

        balance += amount;

        System.out.println("💰 Credited $" + amount + " to Axis account. New balance: $" + balance);

    }



    public void debitAmount(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("💸 Debited $" + amount + " from Axis account. New balance: $" + balance);

        } else {

            System.out.println("⚠ Insufficient balance in Axis account!");

        }

    }



    public void transferAmount(Bank targetBank, double amount) {

        if (amount <= balance) {

            balance -= amount;

            targetBank.creditAmount(amount);

            System.out.println("🔁 Transferred $" + amount + " from Axis to target account.");

        } else {

            System.out.println("⚠ Insufficient balance for transfer in Axis account!");

        }

    }



    public void miniStatement() {

        System.out.println("📄 [Axis] Account Holder: " + accHolderName + " | Account No: " + accNumber + " | Balance: $" + balance);

    }



    public double rateOfInterest() {

        return INTEREST_RATE;

    }

}



// Main class to demonstrate Late Binding

public class SbiAxis11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        // Late binding (Runtime Polymorphism)

        Bank bank;



        System.out.print("Enter Bank Name (SBI/Axis): ");

        String choice = sc.next();



        if (choice.equalsIgnoreCase("SBI")) {

            bank = new SBI();

        } else {

            bank = new Axis();

        }



        bank.createAccount("ACC1001", "Bhavana", 2000.0);

        bank.creditAmount(500);

        bank.debitAmount(300);

        bank.miniStatement();



        System.out.println("🏦 Rate of Interest: " + bank.rateOfInterest() + "%");



        sc.close();

    }

}
