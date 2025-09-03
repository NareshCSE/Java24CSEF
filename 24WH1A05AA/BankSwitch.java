package intro;

import java.util.Scanner;

public class BankSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key;
        int balance = 0;
        boolean accountCreated = false;

        do {
            System.out.println("a --> Account Creation");
            System.out.println("b --> Credit Amount");
            System.out.println("c --> Debit Amount");
            System.out.println("d --> Balance enquiry");
            System.out.println("e --> Transfer Amount");
            System.out.println("y --> Continue");
            System.out.println("n --> Exit");
            System.out.print("Enter your choice: ");
            key = scanner.next();

            switch (key) {
                case "a":
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.print("Enter your Aadhar number: ");
                    long aadhar_no = scanner.nextLong();
                    System.out.print("Enter your PAN number: ");
                    long pan = scanner.nextLong();
                    System.out.println("Your account is created!!");
                    balance = 0;
                    accountCreated = true;
                    break;

                case "b":
                    if (!accountCreated) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter the amount to be credited: ");
                    int credit = scanner.nextInt();
                    balance += credit; 
                    System.out.println("The amount is credited");
                    break;

                case "c":
                    if (!accountCreated) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter the amount to be debited: ");
                    int debit = scanner.nextInt();
                    if (debit <= balance) {
                        balance -= debit; 
                        System.out.println("The amount is debited");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case "d":
                    if (!accountCreated) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.println("The balance amount in your account is " + balance);
                    }
                    break;

                case "e":
                    if (!accountCreated) {
                         System.out.println("Please create an account first.");
                         break;
                    }
                    System.out.print("Enter the amount to be transferred: ");
                    int transfer = scanner.nextInt();
                    if (transfer <= balance) {
                        balance -= transfer;
                        System.out.println("The amount is transferred.");
                    } else {
                        System.out.println("Insufficient balance.");
                      }
                    break;
                case "n":
                    System.out.println("Thank you for using our service.");
                    break;

                case "y":
                	System.out.println("Thank you for continuing our service!!");
                	break;
            }

        } while (!key.equals("n"));

        scanner.close();
    }
}
