package assignment1;
import java.util.Scanner;

public class Diamond{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i += 2) {
            for (int j = (n-i)/2 ; j > 0; j--) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); 
            }
            System.out.println();
        }

        for (int i = n -2; i > 0; i -= 2) {
            for (int j = 0; j < (n-i)/2; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }	
}
