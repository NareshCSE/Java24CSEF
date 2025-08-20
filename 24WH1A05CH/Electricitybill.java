import java.util.Scanner;

public class Electricitybill_1 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter no. of units:");
		int units = myObj.nextInt();
		myObj.close();
		int rate=0;

		if (units <= 50 && units >= 0) {
			rate = units * 1;
		} else if (units > 50 && units <= 100) {
			rate = (50 * 1) + ((units - 50) * 2);
		} else if (units > 100 && units <= 200) {
			rate = (50 * 1) + (50 * 2) + ((units - 100) * 3);
		} else if (units > 200 && units <= 300) {
			rate = (50 * 1) + (50 * 2) + (100 * 3) + ((units - 200) * 4);
		} else if (units > 300 && units <= 400) {
			rate = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((units - 300) * 5);
		} else if (units > 400) {

			rate = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + (300 * 5) + (units - 400) * 6;

		}
		System.out.print("\nTotal price:"+rate);
	}

}


