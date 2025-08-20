
public class pattern_3_2 

{
	
	public static void main(String[] args)
	{
		int n=5;
	for(int k=n-1;k>=1;k--)
	{
		for(int l=n-1;l>=1;l--)
		{
			if (l<=n-k)
			{
			    System.out.print(" *");
			}
			else {
				System.out.print(" ");
			}
				
		}
		System.out.println();

}}}
