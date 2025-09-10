package labprograms;
import java.util.Scanner;

public class dupli5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=input.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}

		System.out.println("Duplicate numbers");

		for(int i=0;i<arr.length;i++) {

			for(int j=i+1;j<arr.length;j++) {

				if(arr[i]==arr[j]) {

				  System.out.println(arr[i]);

				}
				

			}

		}
	}
}

	
