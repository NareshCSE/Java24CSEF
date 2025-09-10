package java2;

import java.util.Scanner;

public class bank {
	
	public static void main(String[] args) {
		 double amount= 0;
	      double account=0;

		Scanner sc=new Scanner(System.in);
		String ch="yes";
		while(ch.equals("yes")){
		System.out.println("1. Account Creation (scan customer details name, aadhar number and pan) \r\n"
				+ "2. Credit Amount (account number and amount)  \r\n"
				+ "3. Debit Amount (account number and money) \r\n"
				+ "4. Mini statement/balance enquiry\r\n"
				+ "5. Transfer account (from account number, to account number, amount)\r\n"
				+ "6. Continue (y/n)\r\n"
				+ "");
		System.out.println("enter the choice");
		int n=sc.nextInt();
		sc.nextLine();
		if(n==1) {
			amount=0;
		}
		switch(n) {
		    case 1:
		    	System.out.println("account creation");
		    	System.out.println("enter the customer name");
		    	String name=sc.nextLine();
		    	System.out.println("enter the aadhar card number");
		    	double aadhar=sc.nextInt();
		    	sc.nextLine();
		    	System.out.println("enter the pan number");
		    	double pan=sc.nextInt();
		    	sc.nextLine();
		    	System.out.println("enter the account number");
			    account=sc.nextInt();
			    sc.nextLine();
		    	break;
		   case 2:
			   System.out.println("Credit Amount ");
			   System.out.println("enter the account number");
			    double account1=sc.nextInt();
			    sc.nextLine();
			    if(account==account1) {
			   System.out.println("enter the amount");
			   double amount1=sc.nextInt();
			   sc.nextLine();
			   amount+=amount1;
			   }
			  
			   break;
		   case 3:
			   System.out.println("Debit Amount");
			   System.out.println("enter account number");
			    double account2=sc.nextInt();
			   sc.nextLine();
			   if(account==account2) {
				   System.out.println("enter the amount");
				   double amount2=sc.nextInt();
				   sc.nextLine();
			        amount=amount-amount2;
			   }
			   break;
		   case 4:
			   System.out.println("Balance Enquiry ");
			   System.out.println(amount);
			   break;
		   case 5:
			   System.out.println("Transfer account ");
			   System.out.println("enter the account 1");
			   System.out.println(account);
			 
			   System.out.println("enter the account 2");
			   double acc2=sc.nextInt();
			   sc.nextLine();
			   System.out.println("transfering the amount");
			   System.out.println(amount);
			   acc2=amount;
			   System.out.println("trnsfer done");
			   break;
		}
		System.out.println("if you want to continue enter YES or enter NO");
		String c=sc.nextLine();
		ch.equals(c);
	}
	
	}
}
