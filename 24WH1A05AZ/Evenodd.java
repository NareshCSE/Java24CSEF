package az;
import java.util.Scanner;
public class Evenodd 
{
    public static void main(String[] args) 
	{
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int[] arr = new int[n];
    	int i,sum1=0,sum2=0;
    	for(i=0;i<n;i++)
    	{
    		System.out.println("enter array"+(i+1));
    		arr[i] =scanner.nextInt();
    	}
    	System.out.println("the integers are");
    	for(i=0;i<n;i++)
    	{
    		System.out.println(arr[i]);
    	}
    	for(i=0;i<n;i++)
    	{
    		if(arr[i]%2==0)
    		{
    			sum1 = sum1 + arr[i];
    		}
    		else
    		{
    			sum2 = sum2 + arr[i];
    		}
    	}
		System.out.println("sum of even integers="+sum1);
		System.out.println("sum of odd integers="+sum2);

	}

}
