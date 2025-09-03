package intro;

import java.util.Scanner;

public class Common_Elements {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array1");
		int size1=sc.nextInt();
		System.out.println("enter the size of the array2");
		int size2=sc.nextInt();
	
		String[] Array1=new String[size1];
		String[] Array2=new String[size2];
		
		
		for(int i=0;i<size1;i++) {
			System.out.println("Enter the value for array1 ");
			Array1[i]=sc.next();
		}
		
		for(int i=0;i<size2;i++) {
			System.out.println("Enter the value for array2");
			Array2[i]=sc.next();
		}
		sc.close();
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(Array1[i].equals(Array2[j])) {
					System.out.println("the common element is"+Array1[i]);
				}
			}
		}
		}

}
