package JavaPrograms;
import java.util.Scanner;

public class electricitybill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of units that has been used: ");
		int n = scanner.nextInt();
		int price;
		System.out.println("The price of the units is :");
		if (n<=50) {
			price = n*1;
			System.out.print(price);
		}
		else if (n<=100) {
			price = (50*1)+((n-50)*2);
			System.out.print(price);
		}
		else if (n<=200) {
			price = (50*1)+(50*2)+((n-100)*3);
			System.out.print(price);
		}
		else if (n<=400) {
			price = (50*1)+(50*2)+(100*3)+((n-200)*4);
			System.out.print(price);
		}
		else {
			price = ((50*1)+(50*2)+(100*3)+(200*4)+((n-400)*5));
			System.out.print(price);
		}
	}
}
