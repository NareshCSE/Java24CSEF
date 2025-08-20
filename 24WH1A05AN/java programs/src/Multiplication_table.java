import java.util.Scanner;
public class Multiplication_table 
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		  System.out.print("Enter N:");
		  int n=sc.nextInt();
		  System.out.println("Multiplication table of "+ n +" is ");
		  for(int i=1;i<=10;i++)
		  {
			 int table=n*i;
			 System.out.println(n+"x"+i+"="+table);
		  }	 
	 }
	}
