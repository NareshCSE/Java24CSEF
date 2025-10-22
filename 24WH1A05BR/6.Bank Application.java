package datatypes;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] aadhar = new String[10];
        String[] pan = new String[10];
        int[] accountNumbers = new int[10];
        double[] balances = new double[10];
        int accountCount = 0;
        int nextAccountNumber = 1001;

        boolean running = true;
        while (running) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Account Creation");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (accountCount < 10) {
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[accountCount] = sc.nextLine();
                        System.out.print("Enter Aadhar Number: ");
                        aadhar[accountCount] = sc.nextLine();
                        System.out.print("Enter PAN Number: ");
                        pan[accountCount] = sc.nextLine();
                        accountNumbers[accountCount] = nextAccountNumber++;
                        balances[accountCount] = 0.0;
                        System.out.println("Account created successfully! Account Number: " + accountNumbers[accountCount]);
                        accountCount++;
                    } else {
                        System.out.println("Account limit reached!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int creditAcc = sc.nextInt();
                    System.out.print("Enter Amount to Credit: ");
                    double creditAmount = sc.nextDouble();
                    boolean foundCredit = false;
                    for (int i = 0; i < accountCount; i++) {
                        if (accountNumbers[i] == creditAcc) {
                            balances[i] += creditAmount;
                            System.out.println("Amount Credited Successfully! New Balance: " + balances[i]);
                            foundCredit = true;
                            break;
                        }
                    }
                    if (!foundCredit) System.out.println("Account not found!");
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int debitAcc = sc.nextInt();
                    System.out.print("Enter Amount to Debit: ");
                    double debitAmount = sc.nextDouble();
                    boolean foundDebit = false;
                    for (int i = 0; i < accountCount; i++) {
                        if (accountNumbers[i] == debitAcc) {
                            if (balances[i] >= debitAmount) {
                                balances[i] -= debitAmount;
                                System.out.println("Amount Debited Successfully! New Balance: " + balances[i]);
                            } else {
                                System.out.println("Insufficient Balance!");
                            }
                            foundDebit = true;
                            break;
                        }
                    }
                    if (!foundDebit) System.out.println("Account not found!");
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int balAcc = sc.nextInt();
                    boolean foundBal = false;
                    for (int i = 0; i < accountCount; i++) {
                        if (accountNumbers[i] == balAcc) {
                            System.out.println("Account Holder: " + names[i]);
                            System.out.println("Balance: " + balances[i]);
                            foundBal = true;
                            break;
                        }
                    }
                    if (!foundBal) System.out.println("Account not found!");
                    break;

                case 5:
                    System.out.print("Enter From Account Number: ");
                    int fromAcc = sc.nextInt();
                    System.out.print("Enter To Account Number: ");
                    int toAcc = sc.nextInt();
                    System.out.print("Enter Amount to Transfer: ");
                    double transferAmount = sc.nextDouble();

                    int fromIndex = -1, toIndex = -1;
                    for (int i = 0; i < accountCount; i++) {
                        if (accountNumbers[i] == fromAcc) fromIndex = i;
                        if (accountNumbers[i] == toAcc) toIndex = i;
                    }

                    if (fromIndex != -1 && toIndex != -1) {
                        if (balances[fromIndex] >= transferAmount) {
                            balances[fromIndex] -= transferAmount;
                            balances[toIndex] += transferAmount;
                            System.out.println("Transfer Successful! New Balance of " + fromAcc + ": " + balances[fromIndex]);
                        } else {
                            System.out.println("Insufficient Balance in source account!");
                        }
                    } else {
                        System.out.println("One or both accounts not found!");
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting Bank Application. Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
