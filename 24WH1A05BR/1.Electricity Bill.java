package datatypes;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter old reading: ");
        int oldReading = sc.nextInt();

        System.out.print("Enter current reading: ");
        int currentReading = sc.nextInt();

        int units = currentReading - oldReading;
        double billAmount = 0;

        if (units <= 50) {
            billAmount = units * 1;
        } 
        else if (units <= 100) {
            billAmount = (50 * 1) + (units - 50) * 2;
        } 
        else if (units <= 200) {
            billAmount = (50 * 1) + (50 * 2) + (units - 100) * 3;
        } 
        else if (units <= 400) {
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + (units - 200) * 4;
        } 
        else { 
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + (units - 400) * 5;
        }

        System.out.println("\nUnits Consumed: " + units);
        System.out.println("Total Bill Amount: Rs. " + billAmount);

        sc.close();
    }
}
