package demo;

public class arrayduplicate {

	public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 2, 4, 5, 3};
		        System.out.println("Duplicate elements using nested loops:");
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    System.out.print(arr[i] + " ");
		                }
		            }
		        }
	}
}
