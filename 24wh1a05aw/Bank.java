package csef5aw;
	import java.util.*;
	public class BankApplication {

		public static void main(String[] args) {
			Scanner number= new Scanner(System.in);
			
		int option;
			String accountNumber="0",account,transfer,choice;
			String name,pan,password;
			int credit,balence,total=0,debit,adharNo;
			System.out.println("1. Account Creation");
			System.out.println("2. Credit Amount");
			System.out.println("3. Debit Amount");
			System.out.println("4.Balence");
			System.out.println("5. Transfer account");
			System.out.println("6. Continue (y/n)");
			
			do {
				System.out.println("Enter your Choice:");
			    option = number.nextInt();
			    switch(option) {
			    case 1:
			    	System.out.println("Enter your Name:");
			        number.nextLine();  // consume leftover newline
			        name = number.nextLine();
			        
	     	    	System.out.println("Enter your Aadhar No:");
	       	    	adharNo=number.nextInt();
	       
			    	System.out.println("Enter Account Number you would like:");
			    	accountNumber=number.nextLine();
			    	number.nextLine(); 
			    	System.out.println("Your account is created.");
			    	break;
			    case 2:
			    	System.out.println("Enter your Account number to Credit Amount:");
			    	account=number.nextLine();
			    	number.nextLine();
			    	System.out.println("Enter Amount you want to Credit");
			    	credit=number.nextInt();
			    	total+=credit;
			    	number.nextLine();
			    	System.out.println("Enter Passcode:");
			    	password=number.nextLine();
			    	System.out.println(credit+"is Credited");
			    	break;		    	
			   case 3:
				    System.out.println("Enter your Account number to Debit Amount:");
				    number.nextLine();
			        account=number.nextLine();
			        
			    	System.out.println("Enter Amount you ant to Debit");
			    	debit=number.nextInt();
			    	total-=debit;
			    	System.out.println("Enter Passcode:");
			    	password=number.nextLine();
			    	System.out.println(debit+"is Debited");
			    	break;
			   case 4:
				   System.out.println("Enter your Account number to check Balence Amount:");
				   number.nextLine();
			       account=number.nextLine();
			       System.out.println("Enter Passcode:");
			       password=number.nextLine();
			        System.out.println("Amount in your Account is"+total);
			        break;
			   case 5:
			    	System.out.println("Enter your Account number to which you want to tranfer money:");
			    	number.nextLine();
			    	transfer=number.nextLine();
			    	System.out.println("enter amount to be transfered:");
			    	debit=number.nextInt();
		    		total-=debit;
		    		System.out.println("Enter Passcode to your account:");
			    	password=number.nextLine();
			    	number.nextLine();
		    		System.out.println(debit+"is Transfered");
		    		break;
			   case 6:
				   System.out.println("Do you want to Continue?");
				   System.out.println("press (y)yes or (n)no:");
				   choice=number.next();
				   if(choice.equals("y")) {
					   
					   System.out.println("Continuing...");
				   }else {
					   System.out.println("Exiting....");
					   System.exit(0);
				   }
				default:
					System.out.println("THANK YOU");
					break;			   	
			    }
				
			}while(option!=7);		
		}
	}


