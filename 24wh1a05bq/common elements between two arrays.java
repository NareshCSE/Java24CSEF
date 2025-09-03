package projects;

public class common2array {
	public static void main(String[] args) {
		        // Step 1: Define two string arrays
		        String[] array1 = {"apple", "banana", "cherry", "mango", "grape"};
		        String[] array2 = {"kiwi", "banana", "grape", "melon", "apple"};

		        System.out.println("Common elements between the two arrays:");

		        // Step 2: Compare each element of array1 with array2
		        for (int i = 0; i < array1.length; i++) {
		            for (int j = 0; j < array2.length; j++) {
		                if (array1[i].equals(array2[j])) {
		                    System.out.println(array1[i]);
		                    break; // prevent duplicate printing if element appears multiple times
		                }
		            }
		        }
		    }
		}

	


