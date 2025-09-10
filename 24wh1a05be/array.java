package comsample;
public class Findduplicate 
{
public static void main(String[] args) 
  {
int[] numbers= {1,1,2,2,3,4,5,6};
for(int i=0;i<numbers.length;i++) 
{
    for(int j=i+1;j<numbers.length;j++) 
    {
        if(numbers[i]==numbers[j]) 
        {
           System.out.println("Duplicate Found:"+numbers[i]);
           break;
        }
    }
 }
}
}
package comsample;
public class MatrixMultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]A= { {1,2,3},{4,5,6} };
		int [][]B= {{7,8},{9,10},{11,12}};
		int [][] result=new int[A.length][B[0].length];
		 for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < B[0].length; j++) {
	                for (int k = 0; k < A[0].length; k++) {
	                    result[i][j] += A[i][k] * B[k][j];
	                }
	            }
		 }
		 for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
		 }

	}

}
//
package comsample;
public class Stringcommon 
{
	public static void main(String[] args) 
	{
		String arr[]= {"abc","bcg","nbc","vbg","aksh","aksh"};
		for(int val1=0; val1<arr.length;val1++)
		{
			for(int val2=val1+1;val2<arr.length;val2 ++)
			{
				if(arr[val1]==arr[val2])
					System.out.println(arr[val1]);
				    break;
			}
		}
	}
}
