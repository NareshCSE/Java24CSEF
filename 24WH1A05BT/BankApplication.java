import java.util.Scanner;

public class BankApplication {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;
        int balance = 0;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Account Creation (scan customer details name, aadhar number and pan)");
            System.out.println("2. Credit Amount (account number and amount)");
            System.out.println("3. Debit Amount (account number and money)");
            System.out.println("4. Mini statement/balance enquiry");
            System.out.println("5. Transfer account (from account number, to account number, amount)");
            System.out.println("6. Exit");
            
            System.out.print("Choose any option: ");
            choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println("Enter the customer details:");
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Aadhar number: ");
                    long aadhar = sc.nextLong();
                    System.out.print("PAN: ");
                    String pan = sc.next();
                    System.out.println("Account is created for " + name);
                    break;

                case "2":
                    System.out.print("Enter the account number: ");
                    int acc = sc.nextInt();
                    System.out.print("Enter the amount to credit: ");
                    int amt = sc.nextInt();
                    balance += amt;
                    System.out.println(amt + " is credited to account - " + acc);
                    break;

                case "3":
                    System.out.print("Enter the account number: ");
                    int acc1 = sc.nextInt();
                    System.out.print("Enter the amount to debit: ");
                    int amt1 = sc.nextInt();
                    if (amt1 <= balance) {
                        balance -= amt1;
                        System.out.println(amt1 + " is debited from account - " + acc1);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case "4":
                    System.out.println("Current Balance: " + balance);
                    break;

                case "5":
                    System.out.print("Enter FROM account number: ");
                    int from = sc.nextInt();
                    System.out.print("Enter TO account number: ");
                    int to = sc.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    int transfer = sc.nextInt();
                    if (transfer <= balance) {
                        balance -= transfer;
                        System.out.println(transfer + " transferred from " + from + " to " + to);
                    } else {
                        System.out.println("Insufficient balance for transfer!");
                    }
                    break;

                case "6":
                    System.out.println("Thank you for using our bank application!");
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }

        } while (true);
    }
}
