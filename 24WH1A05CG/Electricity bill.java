import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Old Meter Reading:");
		int oldReading = scanner.nextInt();
		System.out.print("Enter Current Meter Reading:");
		int currentReading = scanner.nextInt();
		int unitsConsumed = currentReading - oldReading;
		double totalBill = 0;
		if (unitsConsumed < 0)
		{
			System.out.println("ERROR");
		}
		else
		{
			if (unitsConsumed <= 50)
			{
				totalBill = unitsConsumed * 1;
			}
			else if(unitsConsumed <= 100)
			{
				totalBill = (50*1) + ((unitsConsumed - 50) * 2);
			}
			else if(unitsConsumed <= 200)
			{
				totalBill = (50*1) + (50*2) + ((unitsConsumed - 100) * 3);
			}
			else if(unitsConsumed <= 400)
			{
				totalBill = (50*1) + (50*2) + (100*3) + ((unitsConsumed - 200) * 4);
			}
			else
			{
				totalBill = (50*1) + (50*2) + (100*3) + (200*4) + ((unitsConsumed - 400) * 5);
			}
			System.out.println("Units Consumed:" + unitsConsumed);
			System.out.println("Total Electricity Bill: Rs." + totalBill);
		}
		scanner.close();
	}

}
	
