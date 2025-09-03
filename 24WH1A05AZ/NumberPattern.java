package az;
import java.util.Scanner;

public class NumberPattern
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for( int j=i-1;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
