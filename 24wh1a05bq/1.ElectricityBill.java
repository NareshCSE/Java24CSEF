package projects;
import java.util.Scanner;
public class electricitybill {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter old meter reading: ");
	        int oldReading = scanner.nextInt();

	        System.out.print("Enter current meter reading: ");
	        int currentReading = scanner.nextInt();

	        if (currentReading < oldReading) {
	            System.out.println("Invalid readings: current reading must be greater than or equal to old reading.");
	            scanner.close();
	            return;
	        }

	        int units = currentReading - oldReading;
	        int remainingUnits = units;
	        int bill = 0;

	        if (remainingUnits <= 50) {
	            bill += remainingUnits * 1;
	        } else if (remainingUnits <= 100) {
	            bill += 50 * 1;
	            bill += (remainingUnits - 50) * 2;
	        } else if (remainingUnits <= 200) {
	            bill += 50 * 1;
	            bill += 50 * 2;
	            bill += (remainingUnits - 100) * 3;
	        } else if (remainingUnits <= 400) {
	            bill += 50 * 1;
	            bill += 50 * 2;
	            bill += 100 * 3;
	            bill += (remainingUnits - 200) * 4;
	        } else {
	            bill += 50 * 1;
	            bill += 50 * 2;
	            bill += 100 * 3;
	            bill += 200 * 4;
	            bill += (remainingUnits - 400) * 5;
	        }

	        System.out.println("Units consumed: " + units);
	        System.out.println("Electricity bill amount: Rs." + bill);

	        scanner.close();
	    
	}

}


