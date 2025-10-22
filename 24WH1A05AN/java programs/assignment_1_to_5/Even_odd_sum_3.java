package assignment_1_to_5;
import java.util.Scanner;
public class Even_odd_sum_3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers: ");
		int n=sc.nextInt();
		
		int evensum=0;
		int oddsum=0;
		System.out.println("enter" + n + "numbers: ");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			if(num%2==0)
			{
				evensum +=num;
			}
			else
			{
				oddsum +=num;
			}
		}	
		System.out.println(" The sum of even numbers is: " + evensum);
		System.out.println("The sum of odd number is:  " + oddsum);
		sc.close();
	}
}