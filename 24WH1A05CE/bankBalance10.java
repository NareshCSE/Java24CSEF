package javarecord;
class Bank{
	 int balance=0;
	
	public int getBalance()
	{ return balance;
		
	}
}
class BankA extends Bank{
	int balance=1000;
	
	public int getBalance()
	{ 
		return balance;
		
	}
}
class BankB extends Bank{
	int balance=1500;
	
	public int getBalance()
	{ 
		return balance;
		
	}
}
class BankC extends Bank{
	int balance=1000;
	
	public int getBalance()
	{ 
		return balance;
		
	}
}
public class BankBalance {

	public static void main(String[] args) {
		Bank a=new BankA();
		Bank b=new BankB();
		Bank c=new BankC();
		System.out.println("Money deposited in Bank A: $" + a.getBalance());
        System.out.println("Money deposited in Bank B: $" + b.getBalance());
        System.out.println("Money deposited in Bank C: $" + c.getBalance());
		

	}

}
