package az;

import java.util.Scanner;

public class Pattern2
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int s=1;s<=i;s++)
			{
				System.out.print("*");
			}
		    System.out.println();
		}
	}

}
