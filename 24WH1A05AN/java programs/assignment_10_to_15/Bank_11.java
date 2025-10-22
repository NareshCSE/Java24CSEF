package assignment_10_to_15;

import java.util.ArrayList;
import java.util.List;

// Bank interface with services
interface Bank {
    void createAccount(String accountHolder, double initialDeposit);
    void creditAmount(double amount);
    boolean debitAmount(double amount);
    boolean transferAmount(Bank toBank, double amount);
    List<String> miniStatement();
    double getRateOfInterest();
}

// SBI implementation of Bank
class SBI implements Bank {
    private String accountHolder;
    private double balance;
    private List<String> transactions = new ArrayList<>();
    private static final double RATE_OF_INTEREST = 5.5; // example fixed rate

    @Override
    public void createAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        transactions.add("Account created for " + accountHolder + " with initial deposit: " + initialDeposit);
    }

    @Override
    public void creditAmount(double amount) {
        balance += amount;
        transactions.add("Credited: " + amount);
    }

    @Override
    public boolean debitAmount(double amount) {
        if (amount > balance) {
            transactions.add("Failed debit attempt: " + amount);
            return false;
        }
        balance -= amount;
        transactions.add("Debited: " + amount);
        return true;
    }

    @Override
    public boolean transferAmount(Bank toBank, double amount) {
        if (debitAmount(amount)) {
            toBank.creditAmount(amount);
            transactions.add("Transferred " + amount + " to " + toBank.getClass().getSimpleName());
            return true;
        }
        return false;
    }

    @Override
    public List<String> miniStatement() {
        return transactions;
    }

    @Override
    public double getRateOfInterest() {
        return RATE_OF_INTEREST;
    }
}

// Axis implementation of Bank
class Axis implements Bank {
    private String accountHolder;
    private double balance;
    private List<String> transactions = new ArrayList<>();
    private static final double RATE_OF_INTEREST = 6.0; // example fixed rate

    @Override
    public void createAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        transactions.add("Account created for " + accountHolder + " with initial deposit: " + initialDeposit);
    }

    @Override
    public void creditAmount(double amount) {
        balance += amount;
        transactions.add("Credited: " + amount);
    }

    @Override
    public boolean debitAmount(double amount) {
        if (amount > balance) {
            transactions.add("Failed debit attempt: " + amount);
            return false;
        }
        balance -= amount;
        transactions.add("Debited: " + amount);
        return true;
    }

    @Override
    public boolean transferAmount(Bank toBank, double amount) {
        if (debitAmount(amount)) {
            toBank.creditAmount(amount);
            transactions.add("Transferred " + amount + " to " + toBank.getClass().getSimpleName());
            return true;
        }
        return false;
    }

    @Override
    public List<String> miniStatement() {
        return transactions;
    }

    @Override
    public double getRateOfInterest() {
        return RATE_OF_INTEREST;
    }
}

// Main class demonstrating late binding
public class Bank_11 {
    public static void main(String[] args) {
        Bank sbiAccount = new SBI();
        Bank axisAccount = new Axis();

        sbiAccount.createAccount("Alice", 10000);
        axisAccount.createAccount("Bob", 5000);

        sbiAccount.creditAmount(2000);
        axisAccount.creditAmount(1500);

        sbiAccount.debitAmount(3000);
        axisAccount.debitAmount(700);

        sbiAccount.transferAmount(axisAccount, 1000);

        System.out.println("SBI Mini Statement:");
        for (String record : sbiAccount.miniStatement()) {
            System.out.println(record);
        }

        System.out.println("\nAxis Mini Statement:");
        for (String record : axisAccount.miniStatement()) {
            System.out.println(record);
        }

        System.out.println("\nSBI Rate of Interest: " + sbiAccount.getRateOfInterest() + "%");
        System.out.println("Axis Rate of Interest: " + axisAccount.getRateOfInterest() + "%");
    }
}
