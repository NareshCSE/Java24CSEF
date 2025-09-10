import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=scanner.nextInt();
		int i,j,k,l;
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l=1;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		
		
			 
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l=1;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




