import java.util.Scanner;

public class Shpae 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n  numbers:");
		int num = sc.nextInt();
		
		int sum1=0;
		int sum2=0;
		System.out.println("Enter"+ num +"numbers");
		for(int i=0;i<num;i++)
		{
			int n = sc.nextInt();
			if (n%2==0) 
			{
				sum1=sum1+n;
			}
			else 
			{
				sum2=sum2+n;
			}
		}
		System.out.println("The sum of even integers :"+sum1);
		System.out.println("The sum of odd integers :"+sum2);
		
	}
}
	