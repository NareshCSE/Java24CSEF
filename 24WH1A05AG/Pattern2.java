import java.util.Scanner;
public class Week1_triangle_pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows in pattern:");
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
				System.out.print(" *");
			}
		System.out.println();
		}
		sc.close();
		
	}

}
