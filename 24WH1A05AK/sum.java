package clas;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the set of integers:");
		int n=sc.nextInt();
		System.out.println("Enter the set of numbers:");
		int evenSum = 0;
        int oddSum = 0;
		for(int i=1;i<=n;i++) {
			int number = sc.nextInt();
		if (number%2==0) {
			evenSum+=number;
		}
		else {
			oddSum+=number;
		}
			
			
	    		
			
			
		}
		System.out.println("evenSum="+evenSum);		
		System.out.println("oddSum="+oddSum);		

}
}
