package Labproblems;
import java.util.Scanner;
public class Duplicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int len = scanner.nextInt();
		    int[] numbers = new int[len];
	        System.out.println("Enter the elements: ");
	        for (int i = 0; i < len; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        int[] duplicate = new int[len];
	        boolean hasDuplicate = false;
	        System.out.println("Duplicate values:");
			for(int i=0;i<len;i++) {
				for(int j=i+1;j<len;j++) {
					if(numbers[i]==numbers[j]) {
						System.out.println(numbers[i]);
						hasDuplicate=true;
						break;
					}
				}
			}
	        if (!hasDuplicate) {
	            System.out.println("No Duplicate values");
	        }
	     scanner.close();
	}
}
