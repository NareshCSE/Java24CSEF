package assignment1;
import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		int evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of integers to be entered:");
		int count = sc.nextInt();
		int[] numbers = new int[count];
        System.out.print("Enter set of " + count + " integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            if(numbers[i] % 2 == 0) {
            	evenSum += numbers[i];
            }else {
            	oddSum += numbers[i];
            }
        }
        sc.close();
        System.out.println("Sum of even integers is " + evenSum);
        System.out.println("Sum of odd integers is " + oddSum);
	}

}
