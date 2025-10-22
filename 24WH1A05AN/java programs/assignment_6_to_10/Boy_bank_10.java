package assignment_6_to_10;

import java.util.Scanner;

class Bank {
    int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    @Override
    int getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    @Override
    int getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    @Override
    int getBalance() {
        return 2000;
    }
}

public class Boy_bank_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bank name (A, B, or C): ");
        String bankName = scanner.nextLine().trim().toUpperCase();

        Bank bank;

        switch (bankName) {
            case "A":
                bank = new BankA();
                break;
            case "B":
                bank = new BankB();
                break;
            case "C":
                bank = new BankC();
                break;
            default:
                System.out.println("Invalid bank name");
                scanner.close();
                return;
        }

        System.out.println("Balance in Bank " + bankName + ": $" + bank.getBalance());
        scanner.close();
    }
}
