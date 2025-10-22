package labprograms;

interface Bank {
    void createAccount(String accHolderName, double initialDeposit);
    void creditAmount(double amount);
    void debitAmount(double amount);
    void transferAmount(Bank receiver, double amount);
    void miniStatement();
    double getRateOfInterest();
}

class SBI implements Bank {
    private String accHolderName;
    private double balance;
    private final double rateOfInterest = 6.5; 

    public void createAccount(String accHolderName, double initialDeposit) {
        this.accHolderName = accHolderName;
        this.balance = initialDeposit;
        System.out.println("SBI Account created for " + accHolderName + " with balance $" + initialDeposit);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("Credited $" + amount + " to SBI account. New balance: $" + balance);
    }

    public void debitAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited $" + amount + " from SBI account. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in SBI account!");
        }
    }

    public void transferAmount(Bank receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.creditAmount(amount);
            System.out.println("Transferred $" + amount + " from SBI to another account.");
        } else {
            System.out.println("Transfer failed! Not enough balance in SBI account.");
        }
    }

    public void miniStatement() {
        System.out.println("SBI Mini Statement → Name: " + accHolderName + ", Balance: $" + balance);
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }
}

class Axis implements Bank {
    private String accHolderName;
    private double balance;
    private final double rateOfInterest = 7.0; 

    public void createAccount(String accHolderName, double initialDeposit) {
        this.accHolderName = accHolderName;
        this.balance = initialDeposit;
        System.out.println("Axis Account created for " + accHolderName + " with balance $" + initialDeposit);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("Credited $" + amount + " to Axis account. New balance: $" + balance);
    }

    public void debitAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited $" + amount + " from Axis account. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in Axis account!");
        }
    }

    public void transferAmount(Bank receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.creditAmount(amount);
            System.out.println("Transferred $" + amount + " from Axis to another account.");
        } else {
            System.out.println("Transfer failed! Not enough balance in Axis account.");
        }
    }

    public void miniStatement() {
        System.out.println("Axis Mini Statement → Name: " + accHolderName + ", Balance: $" + balance);
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }
}

public class BankInterface {
    public static void main(String[] args) {
      
        Bank bank1 = new SBI();
        Bank bank2 = new Axis();
      
        bank1.createAccount("Lakshmi", 5000);
        bank2.createAccount("Prasanna", 3000);

        bank1.creditAmount(1000);
        bank2.debitAmount(500);

        bank1.transferAmount(bank2, 1500);

        bank1.miniStatement();
        bank2.miniStatement();

        System.out.println("\nRate of Interest in SBI: " + bank1.getRateOfInterest() + "%");
        System.out.println("Rate of Interest in Axis: " + bank2.getRateOfInterest() + "%");
    }
}
