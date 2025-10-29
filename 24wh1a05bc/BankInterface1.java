package labprograms;
import java.util.*;
interface BankServices {
    void createAccount(String accNumber, String accHolderName, double initialDeposit);
    void creditAmount(double amount);
    void debitAmount(double amount);
    void transferAmount(BankServices targetBank, double amount);
    void miniStatement();
    double rateOfInterest();
}
class SBI implements BankServices {
    private String accNumber;
    private String accHolderName;
    private double balance;
    private final double INTEREST_RATE = 6.5;

    public void createAccount(String accNumber, String accHolderName, double initialDeposit) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = initialDeposit;
        System.out.println("SBI Account created for " + accHolderName + " with balance $" + balance);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("Credited $" + amount + ". New balance: $" + balance);
    }

    public void debitAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void transferAmount(BankServices targetBank, double amount) {
        if (amount <= balance) {
            balance -= amount;
            targetBank.creditAmount(amount);
            System.out.println("Transferred $" + amount + " from SBI to target account.");
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    public void miniStatement() {
        System.out.println("[SBI] Account Holder: " + accHolderName +
                " | Account No: " + accNumber + " | Balance: $" + balance);
    }

    public double rateOfInterest() {
        return INTEREST_RATE;
    }
}

class Axis implements BankServices {
    private String accNumber;
    private String accHolderName;
    private double balance;
    private final double INTEREST_RATE = 7.0;

    public void createAccount(String accNumber, String accHolderName, double initialDeposit) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = initialDeposit;
        System.out.println("Axis Account created for " + accHolderName + " with balance $" + balance);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("Credited $" + amount + ". New balance: $" + balance);
    }

    public void debitAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void transferAmount(BankServices targetBank, double amount) {
        if (amount <= balance) {
            balance -= amount;
            targetBank.creditAmount(amount);
            System.out.println("Transferred $" + amount + " from Axis to target account.");
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    public void miniStatement() {
        System.out.println("[Axis] Account Holder: " + accHolderName +
                " | Account No: " + accNumber + " | Balance: $" + balance);
    }

    public double rateOfInterest() {
        return INTEREST_RATE;
    }
}

public class exp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name (SBI/Axis): ");
        String bankName = sc.nextLine();

        BankServices bank;
        if (bankName.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        } else if (bankName.equalsIgnoreCase("Axis")) {
            bank = new Axis();
        } else {
            System.out.println("Invalid bank name. Defaulting to SBI.");
            bank = new SBI();
        }

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit Amount: ");
        double deposit = sc.nextDouble();

        bank.createAccount(accNo, name, deposit);

        System.out.println("\n==== BANK MENU ====");
        System.out.println("1. Credit Amount");
        System.out.println("2. Debit Amount");
        System.out.println("3. Mini Statement");
        System.out.println("4. Show Rate of Interest");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to credit: ");
                    bank.creditAmount(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to debit: ");
                    bank.debitAmount(sc.nextDouble());
                    break;

                case 3:
                    bank.miniStatement();
                    break;

                case 4:
                    System.out.println("Rate of Interest: " + bank.rateOfInterest() + "%");
                    break;

                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
