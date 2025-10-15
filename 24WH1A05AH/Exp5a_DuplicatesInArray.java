package basicprograms;
import java.util.Scanner;
public class ArrayDuplicateValues {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of integers:");
		int n=sc.nextInt();
		int numbers[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter numbers " + i + ":");
			numbers[i]=sc.nextInt();
		}
		System.out.println("Duplicate values are: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println(numbers[i]);
				}
			}
		}
	
	
	}

}
