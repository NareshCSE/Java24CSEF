import java.util.Scanner;
public class Week1_triangle_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the numbers of rows of the pattern:");
		int rows=sc.nextInt();
		int i,j;
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		sc.close();

	}

}
