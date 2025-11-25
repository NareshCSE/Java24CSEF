import java.util.Scanner;
public class Diamond_Pattern {
	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter the number of rows:");
		        int n=sc.nextInt();
		        for(int i=1;i<=n;i++)
		       {
			for(int s=1;s<=n-i;s++)
			{
			      System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
			      System.out.print("* ");
			}
			for(int k=i-1;k>=1;k--)
			{
			      System.out.print("* ");
			}
		            System.out.println();
		       }
		       for(int i=n-1;i>=1;i--)
		      {
			for(int s=1;s<=n-i;s++)
			{
			      System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
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

