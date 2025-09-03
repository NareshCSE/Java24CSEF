import java.util.Scanner;

public class Duplicate_values {

	public static void main(String[] args) {
		System.out.print("What is the size of the array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" numbers:");
		for(int k=0;k<arr.length;k++)
		{
			arr[k]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The duplicate number is:"+arr[j]);
				}
			}
		}
		sc.close();
	}
	
}
