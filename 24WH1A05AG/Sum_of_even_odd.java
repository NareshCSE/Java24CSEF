import java.util.Scanner;
public class Sum_Of_Even_Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,Oddsum=0,Evensum=0;
		System.out.print("Enter how many integers you want to enter:");
		int n=sc.nextInt();
		System.out.print("Enter " + n + " integer: ");
		for(i=1;i<=n;i++)
		{
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


}
