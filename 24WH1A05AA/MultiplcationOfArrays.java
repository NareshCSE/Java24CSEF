package intro;

import java.util.Scanner;

public class MultiplcationOfArrays {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of rows of the Matrix1");
		int rows1 = scanner.nextInt();
		
		System.out.println("Enter the number of columns of the Matrix1");
		int cols1 = scanner.nextInt();
		
		System.out.println("Enter the number of rows of the Matrix2");
		int rows2 = scanner.nextInt();
		
		System.out.println("Enter the number of columns of the Matrix2");
		int cols2 = scanner.nextInt();
		
		if(cols1!=rows2) {
			System.out.println("Matrix multiplication is not possible");
		} else {
			int[][] Matrix1 = new int[rows1][cols1]; 
			int[][] Matrix2 = new int[rows2][cols2];
			
			System.out.println("enter the values of matrix1:");
			
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols1;j++) {
					System.out.println("Enter the values");
					Matrix1[i][j]=scanner.nextInt();
				}
			}
			
			System.out.println("enter the values of matrix2:");
			
			for(int i=0;i<rows2;i++) {
				for(int j=0;j<cols2;j++) {
					System.out.println("Enter the values");
					Matrix2[i][j]=scanner.nextInt();
				}
			}
			int[][] ResultMatrix=new int[rows1][cols2];
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
					for(int k=0;k<rows2;k++) {
						ResultMatrix[i][j]+=Matrix1[i][k]*Matrix2[k][j];
						
					}
				}
			}
			
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
					System.out.print(ResultMatrix[i][j]+" ");
				}
				System.out.println(" ");
			}
			
		}
		scanner.close();
	}

}
