package assignment_1_to_5;
import java.util.Arrays;
public class Matrices_multiplication_5_2 
{
    public static void main(String[] args)
    {
    	int[][] matrix_a= {
    			{1,3,7},
    			{2,4,6}};
    	
    	int[][] matrix_b= {
    			{2,3},
    			{4,6},
    			{1,5}};
    	
    	int rowsA=matrix_a.length;
    	int colsA=matrix_a[0].length;
    	int rowsB=matrix_b.length;
    	int colsB=matrix_b[0].length;
    	
    	if(colsA!=rowsB)
    	{
    		System.out.println("The mutliplication is not possible");
    		return;
    	}
    	int[][] result = new int[rowsA][colsB];
    	for(int i=0;i<rowsA;i++)
    	{
    		 for(int j=0;j<colsB;j++)
    		 {
    			 for(int k=0;k<colsA;k++)  //for(int k=0;k<rowsB;k++)
    			 {
    				 result[i][j]+=matrix_a[i][k] * matrix_b[k][j];
    			 }
    		 }
    	}
  //USE THIS TO PRINT RESULTANT MATRIX IN ANOTHER WAY   	
//System.out.println("resultant matrix is: ");
//	for(int i=0;i<rowsA;i++)
//{
//for(int j=0;j<colsB;j++)
//{
//	System.out.print(Arrays.deepToString(result) + "\t");
//}
//	System.out.println();
//}
    	System.out.println("Resultant matrix is: ");
        System.out.println(Arrays.deepToString(result));
    }
}

