package basicprogrames;
import java.util.Scanner;
public class CommonInTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of Elements in first array:");
		int n1=sc.nextInt();
		String arr1[]=new String[n1];
		for(int i=0;i<n1;i++) {
			System.out.print("Enter first array elements "+ i + ":");
			arr1[i]=sc.next();
		}
		
		System.out.print("Enter number of Elements in second array:");
		int n2=sc.nextInt();
		String arr2[]=new String[n2];
		for(int j=0;j<n2;j++) {
			System.out.print("Enter second array elements "+ j + ":");
			arr2[j]=sc.next();
		}
		System.out.println("Common Elements are:");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(arr1[i].equals(arr2[j])) {   //for string comparison we use .equals instead of == 					
					System.out.println(arr1[i]);	
				}
			}
		}
		sc.close();
		}

}
