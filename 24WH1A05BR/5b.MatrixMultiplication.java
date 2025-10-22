package datatypes;

public class MatricesMultiplication {

	public static void main(String[] args) {
	
		        int[][] A = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        int[][] B = {
		            {7, 8},
		            {9, 10},
		            {11, 12}
		        };

		        int r1 = A.length;
		        int c1 = A[0].length;
		        int r2 = B.length;
		        int c2 = B[0].length;

		        if (c1 != r2) {
		            System.out.println("Matrix multiplication not possible!");
		            return;
		        }

		        int[][] C = new int[r1][c2];

		        for (int i = 0; i < r1; i++) {
		            for (int j = 0; j < c2; j++) {
		                for (int k = 0; k < c1; k++) {
		                    C[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        System.out.println("Resultant Matrix:");
		        for (int i = 0; i < r1; i++) {
		            for (int j = 0; j < c2; j++) {
		                System.out.print(C[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}
