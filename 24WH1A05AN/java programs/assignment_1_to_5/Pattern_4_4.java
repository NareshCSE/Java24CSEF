package assignment_1_to_5;
class Pattern_4_4 
{
	    public static void main(String[] args) 
	    {
	    	int n = 5;
	    	for (int i = 1; i <= n; i++) 
	    	{
	    	    for (int j = i; j < n; j++) 
	    	    {
	    	        System.out.print("  ");
	    	    }
	    	    for (int j = 1; j <= i; j++) 
	    	    {
	    	        System.out.print(j + " ");
	    	    }
	    	    for (int j = i - 1; j >= 1; j--) 
	    	    {
	    	        System.out.print(j + " ");
	    	    }
	    	    System.out.println();
	        }
	    }
}