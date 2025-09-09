import java.util.Scanner;

public class DuplicatesInArrayNoHashSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();

        boolean hasDuplicates = false;

        System.out.println("Duplicate values:");

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // Check if current element was already checked
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not checked before, check for duplicates
            if (!isDuplicate) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] == array[j]) {
                        System.out.println(array[i]);
                        hasDuplicates = true;
                        break;
                    }
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("There are no duplicates in the array.");
        }
    }
}
