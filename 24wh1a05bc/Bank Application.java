import java.util.Scanner;
public class bankApplication {
	    static String[] names = new String[100];
	    static int[] accountNumbers = new int[100];
	    static double[] balances = new double[100];
	    static int accountCount = 0;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char cont;

	        do {
	            System.out.println("\n1. Create Account  2. Credit  3. Debit  4. Balance  5. Transfer");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> createAccount(sc);
	                case 2 -> creditAmount(sc);
	                case 3 -> debitAmount(sc);
	                case 4 -> balanceEnquiry(sc);
	                case 5 -> transferAmount(sc);
	                default -> System.out.println("Invalid choice");
	            }

	            System.out.print("Continue (y/n)? ");
	            cont = sc.next().charAt(0);
	        } while (cont == 'y' || cont == 'Y');

	        sc.close();
	    }

	    static void createAccount(Scanner sc) {
	        sc.nextLine();
	        System.out.print("Enter Name: ");
	        names[accountCount] = sc.nextLine();
	        accountNumbers[accountCount] = 1000 + accountCount;
	        balances[accountCount] = 0;
	        System.out.println("Account created. Number: " + accountNumbers[accountCount]);
	        accountCount++;
	    }

	    static void creditAmount(Scanner sc) {
	        System.out.print("Account No: ");
	        int accNo = sc.nextInt();
	        int idx = findIndex(accNo);
	        if (idx != -1) {
	            System.out.print("Amount to credit: ");
	            balances[idx] += sc.nextDouble();
	            System.out.println("Credited successfully.");
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    static void debitAmount(Scanner sc) {
	        System.out.print("Account No: ");
	        int accNo = sc.nextInt();
	        int idx = findIndex(accNo);
	        if (idx != -1) {
	            System.out.print("Amount to debit: ");
	            double amt = sc.nextDouble();
	            if (balances[idx] >= amt) {
	                balances[idx] -= amt;
	                System.out.println("Debited successfully.");
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    static void balanceEnquiry(Scanner sc) {
	        System.out.print("Account No: ");
	        int accNo = sc.nextInt();
	        int idx = findIndex(accNo);
	        if (idx != -1) {
	            System.out.println("Name: " + names[idx]);
	            System.out.println("Balance: " + balances[idx]);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    static void transferAmount(Scanner sc) {
	        System.out.print("From Account No: ");
	        int fromAcc = sc.nextInt();
	        int fromIdx = findIndex(fromAcc);
	        System.out.print("To Account No: ");
	        int toAcc = sc.nextInt();
	        int toIdx = findIndex(toAcc);

	        if (fromIdx != -1 && toIdx != -1) {
	            System.out.print("Amount to transfer: ");
	            double amt = sc.nextDouble();
	            if (balances[fromIdx] >= amt) {
	                balances[fromIdx] -= amt;
	                balances[toIdx] += amt;
	                System.out.println("Transfer successful.");
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    static int findIndex(int accNo) {
	        for (int i = 0; i < accountCount; i++) {
	            if (accountNumbers[i] == accNo) return i;
	        }
	        return -1;
	    }
	}
