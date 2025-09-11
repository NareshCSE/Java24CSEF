package az;
import java.util.Scanner;
public class ArrayDuplicates 
{
	public static void main(String[] args)
	{
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter size of the array:");
		        int size = scanner.nextInt();
		        int[] arr = new int[size];
		        for (int i = 0; i < size; i++)
		        {
		            System.out.println("Enter element " + i + ":");
		            arr[i] = scanner.nextInt();
		        }
		        System.out.println("Duplicate elements:");
		        for (int i = 0; i < size; i++) 
		        {
		            boolean isDuplicate = false;
		            for (int k = 0; k < i; k++) 
		            {
		                if (arr[i] == arr[k]) 
		                {
		                    isDuplicate = true;
		                    break;
		                }
		            }
		            if (!isDuplicate)
		            {
		                for (int j = i + 1; j < size; j++)
		                {
		                    if (arr[i] == arr[j])
		                    {
		                        System.out.println(arr[i]);
		                        break;
		                    }
		                }
		            }
		        }
		    }
  }














