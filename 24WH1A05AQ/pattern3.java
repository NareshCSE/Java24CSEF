package cse05aq;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for (int j=5;j>i ;j--)
			{
				System.out.print("  ");
			}
		    for(int k=1 ;k<=(2*i-1) ;k++)
		{
			System.out.print("* ");
		}
     System.out.println(  );
}

	for(int i=4;i>=1;i--)
	{
		for(int j=5; j>i; j--)
		{
			System.out.print("  ");
		}
		 for(int k=1;k<=2*i-1;k++)
		 {
			 System.out.print("* ");
		 }
		 System.out.println(" ");
	}
	}
}