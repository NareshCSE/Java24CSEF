package basicprogrames;
import java.util.Scanner;
public class MultiplicationOfArrays {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		
		        System.out.print("Enter rows of first matrix: ");
		        int m = sc.nextInt();
		        System.out.print("Enter columns of first matrix / rows of second matrix: ");
		        int n = sc.nextInt();
		        System.out.print("Enter columns of second matrix: ");
		        int p = sc.nextInt();

		        int A[][]= new int[m][n];
		        System.out.println("Enter elements of first matrix:");
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < n; j++) {
		                A[i][j] = sc.nextInt();
		            }
		        }

		        int B[][] = new int[n][p];
		        System.out.println("Enter elements of second matrix:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < p; j++) {
		                B[i][j] = sc.nextInt();
		            }
		        }

		        int C[][] = new int[m][p];
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < p; j++) {
		                C[i][j] = 0;
		                for (int k = 0; k < n; k++) {
		                    C[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        System.out.println("Resultant Matrix:");
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < p; j++) {
		                System.out.print(C[i][j] + " ");
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		}
