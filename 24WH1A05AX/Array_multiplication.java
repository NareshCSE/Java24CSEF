package javaprog;
import java.util.*;
public class Array_multiplication {

	public static void main(String[] args) {
		Scanner size=new Scanner(System.in);
		System.out.println("Enter size of arrays");
		int rows1=size.nextInt();
		int cols1=size.nextInt();
		int rows2=size.nextInt();
		int cols2=size.nextInt();
		int[][] array1= new int[rows1][cols1];
		int[][] array2= new int[rows2][cols2];
		System.out.println("enter values of array 1:");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols1;j++) {
				array1[i][j]=size.nextInt();
			}
		}
		System.out.println("enter values of array 2:");
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<cols2;j++) {
				array2[i][j]=size.nextInt();
			}
		}
		//printing arrays
		System.out.println("array1");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols1;j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array2");
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<cols2;j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		//multiplication
		
		int[][] result= new int[rows1][cols2];
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++) {
				for(int k=0;k<cols1;k++) {
					result[i][j]+=array1[i][k]*array2[k][j];
				}
			}
		}
		//printing multiplication
		System.out.println("Multiplication");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
