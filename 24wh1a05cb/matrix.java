package patternc;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter number of rows of matrix1:");
		int row1=sc.nextInt();
		System.out.println("Enter number of columns of matrix2:");
		int col1=sc.nextInt();
		System.out.println("Enter number of rows of matrix2");
		int row2=sc.nextInt();
		System.out.println("Enter number of columns of matrix2");
		int col2=sc.nextInt();
		if(row1!=col2) {
			System.out.println("Multiplication is not possible");
		}
		else {
			int[][] m1=new int[row1][col1];
			int[][] m2=new int[row2][col2];
			int[][] res=new int[row1][col2];
			System.out.println("Enter the elements of martix1");
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
					m1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of matrix2");
			for(int i=0;i<row2;i++) {
				for(int j=0;j<col2;j++) {
					m2[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<col1;k++) {
						res[i][j]+=m1[i][k]*m2[k][j];
					}
				}
			}
			for(int i=0;i<row1;i++)  {
				for(int j=0;j<col2;j++) {
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
            }
			sc.close();
		}

	}

}
