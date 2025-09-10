package z9;
import java.util.Scanner;

public class credit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String key;
		int balance=0;
		boolean accountCreated=false;
		do {
			System.out.println("a-->account number");
			System.out.println("b-->credit amount");
			System.out.println("c-->debit amount");
			System.out.println("d-->balance enquiry");
			System.out.println("e-->transfer amount");
			System.out.println("y-->continue");
			System.out.println("n-->exit");
			System.out.println("Enter your choice:");
			key=scanner.next();
			
			switch (key) {
			    case "a":
			    	System.out.println("Enter your name:");
			    	String name=scanner.next();	
			    	System.out.println("Enter your aadhar number:");
			    	long aadhar_no=scanner.nextLong();
			    	System.out.println("Enter your PAN number:");
			    	long pan=scanner.nextLong();
			    	System.out.println("Your amount is credited!");
			    	balance=0;
			    	accountCreated=true;
			    	break;
			    	
			    case "b":
			    	if(!accountCreated) {
			    		System.out.println("Create an account first");
			    		break;
			    	}
			    	System.out.println("Enter amount to be credited:");
			    	int credit=scanner.nextInt();
			    	balance+=credit;
			    	System.out.println("the amount is credited:");
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
			    	 System.out.println("Thank you for continuing our service.");
	                    break;
			}
		}while (!key.equals("n"));
		
			scanner.close();

	}

}
