package arrays;
import java.util.Scanner;

public class MultiplicationArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        scanner.close();
        
        if(cols1 != rows2) {
        	System.out.println("Multiplication not possible");
        }
        else {
        	int[][] multiply = new int[rows1][cols2];
        	for(int i =0 ; i<rows1; i++) {
        		for(int j = 0;j<cols2;j++) {
        			multiply[i][j] = 0;
        			for(int k =0; k< rows2;k++) {
        				multiply[i][j] += matrix1[i][k]*matrix2[k][j];
        			}
        			System.out.print(multiply[i][j] + " ");
        		}
            	System.out.println();
        	}
        }
	}

}
