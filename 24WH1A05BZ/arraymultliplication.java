package java2;

public class array2 {
	public static void main(String[] args) {
	int[][] matrixc=new int[10][10];
	int[][] matrixa= {{1,2,3},{4,5,6},{1,6,7}};
	int[][] matrixb= {{6,7,4},{9,4,6},{6,8,9}};
	int i,j,k;
	int n=3;
	for(i=0;i<n;i++) 
	{
		for(j=0;j<n;j++)
		{
			for(k=0;k<n;k++)
			{
			  matrixc[i][j]+=matrixa[i][k]*matrixb[k][j];
			}
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
				System.out.print("\t"+matrixc[i][j]);
		}
		System.out.println();
	}

}
}
