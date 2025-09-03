package javalab;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size=myObj.nextInt();
		int array[]=new int[size];
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			
			System.out.println("Enter a number: ");
			array[i]=myObj.nextInt();
			
		}
		myObj.close();
		System.out.println("The array is:");
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j]+" ");
		}
		
		System.out.println("\nThe duplicate values are: ");
		int flag=0;
		for(int k=0;k<array.length;k++)
		{ if(k>0)
		    {  
			  int m=k-1;
			  while(m>=0)
			  {
				  if(array[m]==array[k])
				  {flag=1;
					  
				  }
				  m--;
			  }
			}
		  if(flag==1)
			  continue;
		   
			for(int l=k+1;l<array.length;l++)
			{ 
				if(array[k]==array[l])
				{
					System.out.print(array[k]+" ");
					count+=1;
					
					break;
				}
			}
			
		}
		if(count==0)
		{
			System.out.println("No duplicates found");
		}
	}

}
