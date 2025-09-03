import java.util.Scanner;
public class Week1_StarPattern {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter n value:");
		        int n=sc.nextInt();
		        
		        for (int i = 1; i <= n; i++)
		        {
		            for (int s = 1; s <= n - i; s++) 
		            {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= i; j++) 
		            {
		                System.out.print("*   ");
		            }
		            System.out.println();
		        }
		        
		        
		        for (int i = n - 1; i >= 1; i--)
		        {
		            for (int s = 1; s <= n - i; s++) 
		            {
		                System.out.print("  ");
		            }  
		            for (int j = 1; j <= i; j++) 
		            {
		                System.out.print("*   ");
		            }
		            System.out.println();
		        }
		        sc.close();
   }
}
