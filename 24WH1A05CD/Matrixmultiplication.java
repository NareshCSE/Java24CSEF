package javalab;

import java.util.Scanner;

	public class matrixmultiplication {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows for first matrix: ");
	        int r1 = sc.nextInt();
	        System.out.print("Enter number of columns for first matrix: ");
	        int c1 = sc.nextInt();

	        System.out.print("Enter number of rows for second matrix: ");
	        int r2 = sc.nextInt();
	        System.out.print("Enter number of columns for second matrix: ");
	        int c2 = sc.nextInt();

	        if (c1 != r2) {
	            System.out.println("Matrix multiplication is not possible");
	            return;
	        }

	        int[][] mat1 = new int[r1][c1];
	        int[][] mat2 = new int[r2][c2];
	        int[][] result = new int[r1][c2];

	        System.out.println("Enter elements for first matrix:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                mat1[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Enter elements for second matrix:");
	        for (int i = 0; i < r2; i++) {
	            for (int j = 0; j < c2; j++) {
	                mat2[i][j] = sc.nextInt();
	            }
	        }

	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                for (int k = 0; k < c1; k++) {
	                    result[i][j] += mat1[i][k] * mat2[k][j];
	                }
	            }
	        }

	        System.out.println("Product of the matrices:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
