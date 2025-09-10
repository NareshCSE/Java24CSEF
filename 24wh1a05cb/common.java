package patternc;
import java.util.Scanner;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr1=new String[n];
		String[] arr2=new String[n];
		System.out.println("Enter the elements of first array:");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextLine();
		}
		System.out.println("Enter the elements of second array:");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextLine();
		}
		boolean foundCommon=false;
		System.out.println("Common elements of arrays:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr1[i].equals(arr2[j])) {
					foundCommon=true;
					System.out.println(arr1[i]);
					break;
				}
			}
		}
		if(!foundCommon) {
			System.out.println("No elements found Common");
		}
	}

}
