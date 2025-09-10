package basicprograms;
import java.util.Scanner;
public class BankApp {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int operation,money=0,amount=0;
			String choice;
			do {
				System.out.println("\nSelect any below option:");
				System.out.println("1. Account Creation");
				System.out.println("2. Credit Amount");
				System.out.println("3. Debit Amount");
				System.out.println("4. Mini statement/balance enquiry");
				System.out.println("5. Transfer account ");
				System.out.println("6. Exit");
				operation=sc.nextInt();
				
			switch(operation) {
			case 1:
				System.out.println("For account creation please enter the following details:");
				System.out.print("Enter your name:");
				String name=sc.next();
				System.out.print("Enter your Aadhar number:");
				int adhar=sc.nextInt();
				System.out.print("Enter your PAN number:");
				int pan=sc.nextInt();
				System.out.println("\nYour account is successfully created!!");
				break;

			case 2:	
				System.out.print("Enter the amount:");
				amount=sc.nextInt();
				money=money+amount;
				System.out.println("\n" + amount+" is successfully credited!");
				break;

			case 3:
				System.out.print("Enter the amount:");
				amount=sc.nextInt();
				if(amount>money) {
					System.out.println("Insufficient amount");
				}
				else {
				money=money-amount;
				System.out.println("\nSuccess! " + amount + " is debited from your account");
				}
				break;

			case 4:
				System.out.println("\nYour Bank Balance: " + money);
				break;

			case 5:
				System.out.print("Enter your account number:");
				String acc1 = sc.next();
				System.out.print("Enter the account number to transfer:");
				String acc2 = sc.next();
				System.out.print("Enter amount:");
				int transferAmt = sc.nextInt();
				 if (transferAmt > money) {
	                 System.out.println("Insufficient balance for transfer!");
	             } else {
	                 money -= transferAmt;
	                 System.out.println("\nSuccess! Transferred " + transferAmt + " to account " + acc2);
	             }
				break;

			case 6:
				System.out.print("Are you sure you want to exit? (y/n): ");
	            choice = sc.next();
	            if (choice.equals("y")) {
	                System.out.println("Exiting...");
	                sc.close();
	                return;  
	            } else {
	                operation = 0; 
	            }
	            break;

	        default:
	            System.out.println("Invalid option! Try again.");
			  }    
			} while(operation!=6);
		}
	}
