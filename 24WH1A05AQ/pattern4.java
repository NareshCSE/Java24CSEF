package cse05aq;

import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no. of rows:");
		int rows=sc.nextInt();
		int i,j,s;
		for(i=1;i<=rows;i++)
		{
			for(s=1;s<=rows-i;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}	
			sc.close();
	   }

}
