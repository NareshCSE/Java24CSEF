import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of rows of first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int cols1 = sc.nextInt();

 
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number of rows of second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int cols2 = sc.nextInt();

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible! Columns of first matrix must equal rows of second matrix.");
            return;
        }

        
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

       
        int[][] result = new int[rows1][cols2];

        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

       
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
