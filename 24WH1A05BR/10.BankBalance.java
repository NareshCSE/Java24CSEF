package labprograms;

// Parent class
class Bank {
    int getBalance() {
        return 0;  // Default implementation
    }
}

// Subclass for Bank A
class BankA extends Bank {
    int getBalance() {
        return 1000;
    }
}

// Subclass for Bank B
class BankB extends Bank {
    int getBalance() {
        return 1500;
    }
}

// Subclass for Bank C
class BankC extends Bank {
    int getBalance() {
        return 2000;
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Balance in Bank A: $" + a.getBalance());
        System.out.println("Balance in Bank B: $" + b.getBalance());
        System.out.println("Balance in Bank C: $" + c.getBalance());
    }
}
