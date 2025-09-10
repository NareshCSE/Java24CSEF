import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int i,j,k,l;
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(l=k-1;l>1;l--)
			{
				System.out.print(l-1);
			}
			
			System.out.println();
		}
		
		

	}

}
