package java2;

import java.util.Scanner;

public class arradup {
	public static void main(String[] args) {
		int i,j,n=3;
		Scanner sc=new Scanner(System.in);
	     String[] arr1 = new String[n];
	     String[] arr2 = new String[n];
		for(i=0;i<n;i++)
		{
			arr1[i]=sc.nextLine();
		}
		for(j=0;j<n;j++)
		{
			arr2[j]=sc.nextLine();
		}
		 for(i=0;i<n;i++)
		 {
	    	  for(j=0;j<n;j++) 
	    	  {
	    		  if (arr1[i].equals(arr2[j]))
	    		  {
	    			 System.out.println(arr1[i]);
	    		  }
	    	  }
		
            }
       
       

}
}
