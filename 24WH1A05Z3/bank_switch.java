package assignment_problems;
import java.util.Scanner;

public class Switch_bank {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);

        String name = "";
        String aadhar = "";
        String pan = "";
        double balance = 0;
        boolean accountCreated = false;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Credit");
            System.out.println("3. Debit");
            System.out.println("4. Balance");
            System.out.println("5. Transfer");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Aadhar: ");
                    aadhar = sc.nextLine();
                    System.out.print("PAN: ");
                    pan = sc.nextLine();
                    accountCreated = true;
                    System.out.println("Account created");
                    break;
                case 2:
                    if (!accountCreated) {
                        System.out.println("Create account first");
                    } else {
                        System.out.print("Amount to credit: ");
                        double amount = sc.nextDouble();
                        balance += amount;
                        System.out.println("Amount credited");
                    }
                    break;
                case 3:
                    if (!accountCreated) {
                        System.out.println("Create account first");
                    } else {
                        System.out.print("Amount to debit: ");
                        double amount = sc.nextDouble();
                        if (amount > balance) {
                            System.out.println("Not enough balance");
                        } else {
                            balance -= amount;
                            System.out.println("Amount debited");
                        }
                    }
                    break;
                case 4:
                    if (!accountCreated) {
                        System.out.println("Create account first");
                    } else {
                        System.out.println("Balance: " + balance);
                    }
                    break;
                case 5:
                    if (!accountCreated) {
                        System.out.println("Create account first");
                    } else {
                        System.out.print("Amount to transfer: ");
                        double amount = sc.nextDouble();
                        if (amount > balance) {
                            System.out.println("Not enough balance");
                        } else {
                            balance -= amount;
                            System.out.println("Amount transferred");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(ch != 6);

        sc.close();
    }
}

