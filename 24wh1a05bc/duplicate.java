package labprograms;
import java.util.Scanner;
public class duplicates {

	 public static void main(String[] args) {
	        int n;
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        n = input.nextInt();

	        int[] arr = new int[n];  
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = input.nextInt();  
	        }

	        System.out.println("Duplicate elements are:");
	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;

	            
	            for (int k = 0; k < i; k++) {
	                if (arr[i] == arr[k]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (isDuplicate)
	                continue; 

	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]);
	                    break;
	                }
	            }
	        }
	    }
	}


