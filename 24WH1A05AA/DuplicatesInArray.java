package intro;

import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the size of the Array");
		int size = scanner.nextInt();
		
		int[] Array = new int[size]; 
		boolean flag = true; 
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value ");
			Array[i] =scanner.nextInt();
		}
		
		
		scanner.close();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size && j!=i;j++) {
				if(Array[i]==Array[j]) {
					System.out.println("Duplicate value is "+ Array[i]);
					flag=false;
					}
				}
			}
		
		
	if(flag==false) {
		System.out.println("Printed the duplicates");
	}
	else {
		System.out.println("There are no duplicates in the Array");
	}
 
	}
}
