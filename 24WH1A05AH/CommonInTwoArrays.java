package basicprograms;
import java.util.Scanner;
public class CommonInTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Elements in first array:");
		int n1=sc.nextInt();
		String arr1[]=new String[n1];
		for(int i=0;i<n1;i++) {
			System.out.println("Enter first array elements " + i + ":");
			arr1[i]=sc.next();
		}
		
		System.out.print("Enter numbers of element in second array:");
		int n2=sc.nextInt();
		String arr2[]=new String[n2];
		for(int j=0;j<n2;j++) {
			System.out.println("Enter second array elements " + j + ":");
			arr2[j]=sc.next();
		}
		System.out.println("Common elements are: ");
	   for(int i=0;i<n1;i++) {
		   for(int j=0;j<n2;j++) {
			   if(arr1[i].equals(arr2[j])) {
				   System.out.println(arr1[i]);
			   }
		   }
	   }
	   sc.close();
	}

}
