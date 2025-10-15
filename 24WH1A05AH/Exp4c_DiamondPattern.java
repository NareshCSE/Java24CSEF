import java.util.Scanner;

public class Week1_diamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no. of rows:");
		int rows=sc.nextInt();
		int i,j,s;
		for(i=1;i<=rows;i++)
		{
			for(s=1;s<=rows-i;s++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=rows-1;i>=1;i--)
		{
			for(s=1;s<=rows-i;s++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
			
	   }
	}
