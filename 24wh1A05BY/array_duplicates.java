package array.java;
import java.util.Scanner;
public class array1 {
//find duplicate values in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,4,2,1};
		int[] arr1=new int[50];
		int i,n=7,j,k=0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if (arr[i]==arr[j] && i!=j) {
					System.out.println(arr[i]);
					break;
					
				}
			}
		}
	
	
	}

}
