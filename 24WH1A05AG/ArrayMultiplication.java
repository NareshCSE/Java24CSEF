import java.util.*;
public class Array_Multiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arrays:");
		int rows1=sc.nextInt();
		int columns1=sc.nextInt();
		int rows2=sc.nextInt();
		int columns2=sc.nextInt();
		int[][] array1= new int[rows1][columns1];
		int[][] array2= new int[rows2][columns2];
		System.out.println("enter values of array 1:");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<columns1;j++) {
				array1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter values of array 2:");
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<columns2;j++) {
				array2[i][j]=sc.nextInt();
			}
		}
		int[][] result= new int[rows1][columns2];
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<columns2;j++) {
				for(int k=0;k<columns1;k++) {
					result[i][j]+=array1[i][k]*array2[k][j];
				}
			}
		}
		System.out.println("Multiplication");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<columns2;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
                        sc.close();
	}
}
