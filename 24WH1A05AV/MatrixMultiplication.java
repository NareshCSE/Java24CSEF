import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter rows of matrix1: ");
        int row1 = read.nextInt();
        System.out.print("Enter columns of matrix1: ");
        int col1 = read.nextInt();

        System.out.print("Enter rows of matrix2: ");
        int row2 = read.nextInt();
        System.out.print("Enter columns of matrix2: ");
        int col2 = read.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix Multiplication Not Possible");
            return;
        }

        int mat1[][] = new int[row1][col1];
        int mat2[][] = new int[row2][col2];
        int mat3[][] = new int[row1][col2]; 

        System.out.println("Enter elements of matrix1:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = read.nextInt();
            }
        }

        System.out.println("Enter elements of matrix2:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = read.nextInt();
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                mat3[i][j] = 0; 
                for (int k = 0; k < col1; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
        read.close();
    }
}
