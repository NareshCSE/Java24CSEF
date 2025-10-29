package csef5aw;
import java.util.Scanner;

public class Duplicate_valuesarray {

    public static void main(String[] args) {
        int i, j;
        int n;
        Scanner size = new Scanner(System.in);

        System.out.println("Enter size of array:");
        n = size.nextInt();
        int array[] = new int[n];

        System.out.println("Enter values of array:");
        for (i = 0; i < n; i++) {
            array[i] = size.nextInt();
        }

        System.out.println("Duplicate elements are:");
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    // Check if this duplicate has already been printed
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (array[k] == array[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.println(array[i]);
                    }
                    break; // break inner loop once duplicate is found
                }
            }
        }
    }
}
