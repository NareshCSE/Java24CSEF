package basicprograms;

import java.util.Scanner;

public class Week1_triangle_pattern1 {
		public static void main(String[] args)
		{
			int i,j,s;
			Scanner sc=new Scanner(System.in);
			System.out.print("How many lines of pattern you wanna print:");
			int n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				for(s=1;s<=n-i;s++)
				{
					System.out.print("  ");
				}
				for(j=1;j<=i;j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			sc.close();
		}}


