package Labproblems;
import java.util.Scanner;
public class MultiplicationOfArrays {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		System.out.println("Enter rows of first matrix:");
		int rowsA=scanner.nextInt();
		System.out.println("Enter columns of first matrix:");
		int colsA=scanner.nextInt();
		System.out.println("Enter rows of second matrix:");
		int rowsB=scanner.nextInt();
		System.out.println("Enter columns of second matrix:");
		int colsB=scanner.nextInt();
		if(colsA!=rowsB) {
			System.out.println("Multiplaction is not possible.");
			return;
		}
		int [][]A=new int[rowsA][colsA];
		int [][]B=new int[rowsB][colsB];
		int [][]C=new int[rowsA][colsB];
		System.out.println("Enter elements of first matrix:");
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsA;j++) {
			     A[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter elements of second matrix:");
		for(int i=0;i<rowsB;i++) {
			for(int j=0;j<colsB;j++) {
				B[i][j]=scanner.nextInt();
			}
		}
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	            	C[i][j]=0;
	                for (int k = 0; k < colsA; k++) {
	                	C[i][j]+=A[i][k]*B[k][j];
	                }
	            }
	        }
	        System.out.println("Result of matrix multiplication:");
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                System.out.print(C[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
