package projects;

public class Multiplication2 {

	public static void main(String[] args) {
		 // Step 1: Define two matrices
		        int[][] A = {
		            {11, 22, 33},
		            {44, 55, 66}
		        };

		        int[][] B = {
		            {7, 8},
		            {9, 10},
		            {11, 12}
		        };

		        // Step 2: Rows of A, Columns of B
		        int rowsA = A.length;
		        int colsA = A[0].length;
		        int rowsB = B.length;
		        int colsB = B[0].length;

		        // Step 3: Check if multiplication is possible (colsA == rowsB)
		        if (colsA != rowsB) {
		            System.out.println("Matrix multiplication not possible!");
		            return;
		        }

		        // Step 4: Resultant matrix
		        int[][] result = new int[rowsA][colsB];

		        // Step 5: Multiply using 3 nested loops
		        for (int i = 0; i < rowsA; i++) {            // Row of A
		            for (int j = 0; j < colsB; j++) {        // Column of B
		                for (int k = 0; k < colsA; k++) {    // Common dimension
		                    result[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        // Step 6: Print result
		        System.out.println("Resultant Matrix:");
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}

	


