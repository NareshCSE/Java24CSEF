import java.util.Scanner;
public class Week1_Sumof_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,Oddsum=0,Evensum=0;
		System.out.print("Enter how many integers you want to enter:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print("Enter " + i + " integer: ");
			int num=sc.nextInt();
			if(num%2==0)
			{
				Evensum=Evensum+num;
			}
			else
			{
				Oddsum=Oddsum+num;
			}
		}
		System.out.println("Odd sum is " + Oddsum );
		System.out.println("Even sum is " + Evensum);
		sc.close();
	}

}
