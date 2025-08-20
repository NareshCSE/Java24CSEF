package akshitha;
import java.util.Scanner;
public class star {
    public static void main(String[] args) 
    {
        [ 1 pattern left aligned]
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\n1: Left-aligned ");
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        [ 2 pattern right aligned]
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("\nPattern 2: Right-aligned triangle");
		for (int i = 1; i <= rows; i++) {
			for (int space = rows - i; space > 0; space--) {
				System.out.print("    ");//4 space
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("   *");//3 space
			}
			System.out.println();
		}
        [3 rd pattern diamond]
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nPattern: Diamond");

        // Upper half of the diamond (including middle row)
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        [4 patteern numbered pyramid]
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nCentered Number Mirror Pyramid:\n");

        for (int i = 1; i <= rows; i++) {
            // Print spaces to center the pyramid
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  "); // 2 spaces
            }

            // Left half: increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Right half: decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
