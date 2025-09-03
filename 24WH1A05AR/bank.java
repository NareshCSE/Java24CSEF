/*
Assignment 6:  Bank Application. Bank Employees have to get the menu with internal options 
1. Account Creation (scan customer details name, aadhar number and pan) 
2. Credit Amount (account number and amount)  
3. Debit Amount (account number and money) 
4. Mini statement/balance inquiry
5. Transfer account (from account number, to account number, amount)
6. Continue (y/n)
Upon selecting the option the respective operation has to be performed with a success message returned and repeat the menu. (Use all Control structures that are applicable, variables/arrays) 
*/
package projectsAR;
import java.util.Scanner;
class bankApllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
        do {
        	System.out.println("1.Account Creation");
        	System.out.println("2.Credit Amount");
        	System.out.println("3.Debit Amount");
        	System.out.println("4.balance inquiry");
        	System.out.println("5.Transfer account");
        	System.out.println("6.continue");
        	System.out.println("Enter your choice(1-6):");
        	int choice=scanner.nextInt();
        	switch(choice) {
        	case 1:System.out.println("Your name: ");
        	       string name=scanner.nextInt();
        	       System.out.println("Your Aadhar number: ");
        	       long aadhar_number=scanner.nextInt();
        	       System.out.println("Your PAN card number: ");
        	       long pancard_number=scanner.nextInt();
        	       System.out.println("Successfully Done..");
        	       break;
        	case 2:System.out.println("Account number:");
        	       int account_number=scanner.nextInt();
        	       System.out.println("Amount:");
        	       int amount=scanner.nextInt();
        	       System.out.println("Successfully Done..");
        	       break;
            case 3:System.out.println("Account number:");
 	               int accountnumber=scanner.nextInt();
 	               System.out.println("Amount:");
 	               int Amount=scanner.nextInt();
 	               System.out.println("Successfully Done..");
 	               break;
            case 4:System.out.println("Check_balance");
                   System.out.println("Successfully Done..");
                   break;
            case 5:System.out.println("From Account number");
                   int from_account=scanner.nextInt();
                   System.out.println("To Account number");
                   int to_account=scanner.nextInt();
                   System.out.println("Amount:");
                   int transfer_amount=scanner.nextInt();
                   System.out.println("Successfully Done..");
                   break;
            case 6:System.out.println("To Continue:y/n");
                   System.out.println("Successfully Done..");
        	}
        	
        }
        while(choice<7)
	}

}

