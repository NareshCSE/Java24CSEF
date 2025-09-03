package projects;
import java.util.Scanner;
public class bank1 {
	    // Arrays to store customer details
	    static String[] customerNames = new String[100];
	    static String[] aadharNumbers = new String[100];
	    static String[] panNumbers = new String[100];
	    static double[] balances = new double[100];
	    static int[] accountNumbers = new int[100];

	    static int customerCount = 0;
	    static int nextAccountNumber = 1001; // Starting account number

	    // Method: Create new account
	    static void createAccount(Scanner sc) {
	        System.out.print("Enter customer name: ");
	        String name = sc.next();
	        System.out.print("Enter Aadhar number: ");
	        String aadhar = sc.next();
	        System.out.print("Enter PAN number: ");
	        String pan = sc.next();

	        customerNames[customerCount] = name;
	        aadharNumbers[customerCount] = aadhar;
	        panNumbers[customerCount] = pan;
	        balances[customerCount] = 0.0; // initial balance
	        accountNumbers[customerCount] = nextAccountNumber;

	        System.out.println("✅ Account created successfully!");
	        System.out.println("Your Account Number is: " + nextAccountNumber);

	        customerCount++;
	        nextAccountNumber++;
	    }

	    // Method: Credit money
	    static void creditAmount(Scanner sc) {
	        System.out.print("Enter account number: ");
	        int acc = sc.nextInt();
	        System.out.print("Enter amount to credit: ");
	        double amt = sc.nextDouble();

	        for (int i = 0; i < customerCount; i++) {
	            if (accountNumbers[i] == acc) {
	                balances[i] += amt;
	                System.out.println("✅ Amount credited successfully! New Balance: " + balances[i]);
	                return;
	            }
	        }
	        System.out.println("❌ Invalid account number!");
	    }

	    // Method: Debit money
	    static void debitAmount(Scanner sc) {
	        System.out.print("Enter account number: ");
	        int acc = sc.nextInt();
	        System.out.print("Enter amount to debit: ");
	        double amt = sc.nextDouble();

	        for (int i = 0; i < customerCount; i++) {
	            if (accountNumbers[i] == acc) {
	                if (balances[i] >= amt) {
	                    balances[i] -= amt;
	                    System.out.println("✅ Amount debited successfully! New Balance: " + balances[i]);
	                } else {
	                    System.out.println("❌ Insufficient balance!");
	                }
	                return;
	            }
	        }
	        System.out.println("❌ Invalid account number!");
	    }

	    // Method: Balance enquiry
	    static void balanceEnquiry(Scanner sc) {
	        System.out.print("Enter account number: ");
	        int acc = sc.nextInt();

	        for (int i = 0; i < customerCount; i++) {
	            if (accountNumbers[i] == acc) {
	                System.out.println("📃 Mini Statement");
	                System.out.println("Account Holder: " + customerNames[i]);
	                System.out.println("Account Number: " + accountNumbers[i]);
	                System.out.println("Balance: " + balances[i]);
	                return;
	            }
	        }
	        System.out.println("❌ Invalid account number!");
	    }

	    // Method: Transfer money
	    static void transferAmount(Scanner sc) {
	        System.out.print("Enter From Account Number: ");
	        int fromAcc = sc.nextInt();
	        System.out.print("Enter To Account Number: ");
	        int toAcc = sc.nextInt();
	        System.out.print("Enter Amount to Transfer: ");
	        double amt = sc.nextDouble();

	        int fromIndex = -1, toIndex = -1;

	        for (int i = 0; i < customerCount; i++) {
	            if (accountNumbers[i] == fromAcc) fromIndex = i;
	            if (accountNumbers[i] == toAcc) toIndex = i;
	        }

	        if (fromIndex == -1 || toIndex == -1) {
	            System.out.println("❌ Invalid account number(s)!");
	            return;
	        }

	        if (balances[fromIndex] >= amt) {
	            balances[fromIndex] -= amt;
	            balances[toIndex] += amt;
	            System.out.println("✅ Transfer successful!");
	            System.out.println("New Balance of " + fromAcc + ": " + balances[fromIndex]);
	        } else {
	            System.out.println("❌ Insufficient balance in source account!");
	        }
	    }

	    // Main menu
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) { // menu repeats until exit
	            System.out.println("\n==== Bank Menu ====");
	            System.out.println("1. Account Creation");
	            System.out.println("2. Credit Amount");
	            System.out.println("3. Debit Amount");
	            System.out.println("4. Mini Statement / Balance Enquiry");
	            System.out.println("5. Transfer Amount");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            int option = sc.nextInt();

	            switch (option) {
	                case 1: createAccount(sc); break;
	                case 2: creditAmount(sc); break;
	                case 3: debitAmount(sc); break;
	                case 4: balanceEnquiry(sc); break;
	                case 5: transferAmount(sc); break;
	                case 6: 
	                    System.out.println("👋 Exiting Bank Application. Thank you!");
	                    return;
	                default: 
	                    System.out.println("❌ Invalid option. Try again.");
	            }
	        }
	    }
	}



