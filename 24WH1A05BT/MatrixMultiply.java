import java.util.Scanner;
public class MultiplyMatrix {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter rows and columns of Matrix A:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter rows and columns of Matrix B:");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		if (c1 != r2) {
			System.out.println("Matrix multiplication is not possible.");
		}
		else {
			int[][] A = new int[r1][c1];
			int[][] B = new int[r2][c2];
			System.out.println("Enter elements of Matrix A:");
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c1; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter elements of Matrix B:");
			for(int i = 0; i < r2; i++) {
				for(int j = 0; j < c2; j++) {
					B[i][j] = sc.nextInt();
				}
			}
			int[][] C = new int[r1][c2];
			System.out.println("Multiplication of Matrix A and Matrix B is: ");
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c2; j++) {
					for(int k = 0; k < r2; k++) {
						C[i][j] += A[i][k]*B[k][j];
					}
				}
			}
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c2; j++) {
					System.out.print(C[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
