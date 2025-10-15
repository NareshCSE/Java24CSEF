package basicprograms;
import java.util.Scanner;
public class Week1_triangle_pattern 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many lines of pattern you wanna print:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
