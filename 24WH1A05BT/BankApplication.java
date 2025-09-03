import java.util.Scanner;
public class BankApplication {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		do {
			System.out.println("MENU:\n1. Account Creation (scan customer details name, aadhar number and pan) \r\n"
					+ "2. Credit Amount (account number and amount)  \r\n"
					+ "3. Debit Amount (account number and money) \r\n"
					+ "4. Mini statement/balance enquiry\r\n"
					+ "5. Transfer account (from account number, to account number, amount)\r\n"
					+ "6. Continue (y/n)\r\n");
			System.out.println("Choose any option:")
			String choice = sc.next();
			switch(choice) {
				case "1":
					System.out.println("Enter the customer details:");
					System.out.print("Name: ");
					String name = sc.next();
					System.out.print("Aadhar number: ");
					int aadhar = sc.nextInt();
					System.out.print("PAN: ");
					String pan = sc.next();
					System.out.println("Account is created.");
					break;
				case "2":
					System.out.print("Enter the account number:");
					int acc = sc.nextInt();
					System.out.print("Enter the amount to credit:");
					int amt = sc.nextInt();
					System.out.println(amt+" is credited to account - "+acc);
					break;
				case "3":
					System.out.print("Enter the account number:");
					int acc1 = sc.nextInt();
					System.out.print("Enter the amount to debit:");
					int amt1 = sc.nextInt();
					System.out.println(amt1+" is debited from account - "+acc1);
					break;
				case "4":
					
			}
			
		}while (choice != "n");
		

	}

}
