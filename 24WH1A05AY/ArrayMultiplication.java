package csef_ay;
import java.util.Scanner;

public class MultiplicationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int row1=scanner.nextInt();
		int col1=scanner.nextInt();
		int arr1[][]=new int[row1][col1];
		int row2=scanner.nextInt();
		int col2=scanner.nextInt();
		int arr2[][]=new int[row2][col2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				arr1[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				arr2[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

		int mul[][]=new int[row1][col2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<col1;k++) {
					mul[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
					System.out.print(mul[i][j] + " ");
				}
				System.out.println();
			}

	}

}
