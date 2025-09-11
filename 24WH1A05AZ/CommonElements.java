package az;
import java.util.*;
public class CommonElements 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int size1=scanner.nextInt();
		int size2=scanner.nextInt();
		scanner.nextLine();
		String arr1[]=new String[size1];
		String arr2[]=new String[size2];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=scanner.nextLine();
		}
		for(int i=0;i<size1;i++) 
		{
			System.out.print(arr1[i]+" ");
		}
		for(int j=0;j<size2;j++)
		{
			arr2[j]=scanner.nextLine();
		}
		for(int j=0;j<size2;j++) 
		{
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(arr1[i].equals(arr2[j])) 
				{
					System.out.println(arr1[i]+" ");
					break;
				}
			}
		}
	}
}
