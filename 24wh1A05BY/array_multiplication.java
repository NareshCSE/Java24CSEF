package array.java;
import java.util.Scanner;

public class array2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner res=new Scanner(System.in);
		int[][] a=new int[500][500];
		int[][] b=new int[500][500];
		int[][] c=new int[500][500];
		System.out.println("enter size of square matrices:");
		 int n= res.nextInt();
		 System.out.println("enter matrix1:");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				 a[i][j]= res.nextInt();
			}
		}
		System.out.println("enter matrix2:");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				 b[i][j]= res.nextInt();
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				for(k=0;k<n;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print("\t"+c[i][j]);
			}
			System.out.println();
		}

	}
		
		

	}


