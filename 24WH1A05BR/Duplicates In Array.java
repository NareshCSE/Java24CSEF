package datatypes;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		        int[] numbers = {4, 2, 7, 4, 8, 2, 5, 7,8,7};
		        int length = numbers.length;

		        System.out.println("Duplicate elements in the array:");

		        for (int i = 0; i < length; i++) {
		            // Skip if element is already marked as visited
		            if (numbers[i] == -1) continue;

		            for (int j = i + 1; j < length; j++) {
		                if (numbers[i] == numbers[j]) {
		                    System.out.println(numbers[i]);
		                    // Mark the duplicate so it's not printed again
		                    numbers[j] = -1;
		                    break; // Only print once
		                }
		            }
		        }
		    }
	}


