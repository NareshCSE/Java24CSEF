package az;
import java.util.Scanner;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int n = scanner.nextInt();
		int i,j,s;
		for(i=1;i<=n;i++)
		{
			for(s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
