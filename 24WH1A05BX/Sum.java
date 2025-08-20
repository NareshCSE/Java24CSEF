package demo;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n = sc.nextInt();
		int evensum=0 ;
		int i;
		int oddsum = 0;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter a number : ");
			int num = sc.nextInt();
			if (num %2== 0)
			{
				 evensum+= num;
			}
			else
			{
				oddsum+=num;
			}
			
		}
		
       System.out.println("\nSum of even integers : " + evensum);
       System.out.println("Sum of odd integers : "+ oddsum );
	}

}
