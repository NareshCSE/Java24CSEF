import java.util.Scanner;
public class Even_or_odd 
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter N:");
	  int n=sc.nextInt();
	  
	  if(n%2==0) 
	  {
		  System.out.println(n+ " is even number");
	  }
	  else 
	  {
		  System.out.println(n+" is odd number");
	  }
  }
}
