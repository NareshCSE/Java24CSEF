import java.util.Scanner;
public class duplicateValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int[] A = new int[n];
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("The array elements you entered are ");
		for(i=0;i<n;i++)
		{
			System.out.println(A[i]+" ");
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(A[i]==A[j])
				{
					count++;
					if(count>=1)
					{
						System.out.println("The elements repeated are: ");
						System.out.println(A[i]);
					}
					
				}
				
			}
			
		}
		
		

	}

}
