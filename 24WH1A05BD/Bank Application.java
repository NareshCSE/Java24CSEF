package add;
import java.util.Scanner;
public class BankApp{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int operation,money=0,amount=0;
		String choice;
		do {
			System.out.println(" Select any operation:");
			System.out.println("1. Account creation");
			System.out.println("2. Credit Amount");
			System.out.println("3. Debit Amounrt");
			System.out.println("4. Mini Statemnet/Bank Enquiry");
			System.out.println("5. Transfer Account");
			System.out.println("6. countinue(y/n)");
			operation=scanner.nextInt();
			
			switch(operation) {
				case 1:
					System.out.println("For account creation please enter the following details:");
					System.out.print("Enter your name:");
					String name=scanner.next();
					System.out.print("Enter your Aadhar number:");
					int adhar=scanner.nextInt();
					System.out.print("Enter your PAN number:");
					int pan=scanner.nextInt();
					System.out.println("\nYour account is successfully created!!");
					break;

				case 2:	
					System.out.print("Enter the amount:");
					amount=scanner.nextInt();
					money=money+amount;
					System.out.println("\n" + amount+" is successfully credited!");
					break;

				case 3:
					System.out.print("Enter the amount:");
					amount=scanner.nextInt();
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
					String acc1 = scanner.next();
					System.out.print("Enter the account number to transfer:");
					String acc2 = scanner.next();
					System.out.print("Enter amount:");
					int transferAmt = scanner.nextInt();
					 if (transferAmt > money) {
		                 System.out.println("Insufficient balance for transfer!");
		             } else {
		                 money -= transferAmt;
		                 System.out.println("\nSuccess! Transferred " + transferAmt + " to account " + acc2);
		             }
					break;

				case 6:
					System.out.print("Are you sure you want to exit?(y/n):");
		            choice = scanner.next();
		            if (choice.equals("y")) {
		                System.out.println("Exiting...");
		                scanner.close();
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
		
		

	


