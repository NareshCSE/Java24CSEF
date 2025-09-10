package projects;
		// Base class
		class Bank {
		    public int getBalance() {
		        return 0; // Default implementation
		    }
		}

		// Subclass for Bank A
		class BankA extends Bank {
		    @Override
		    public int getBalance() {
		        return 1000;
		    }
		}

		// Subclass for Bank B
		class BankB extends Bank {
		    @Override
		    public int getBalance() {
		        return 1500;
		    }
		}

		// Subclass for Bank C
		class BankC extends Bank {
		    @Override
		    public int getBalance() {
		        return 2000;
		    }
		}

		// Main class with given name
		public class ThreeBank {
		    public static void main(String[] args) {
		        BankA a = new BankA();
		        BankB b = new BankB();
		        BankC c = new BankC();

		        System.out.println("Money deposited in Bank A: $" + a.getBalance());
		        System.out.println("Money deposited in Bank B: $" + b.getBalance());
		        System.out.println("Money deposited in Bank C: $" + c.getBalance());
		    }
		}

	
