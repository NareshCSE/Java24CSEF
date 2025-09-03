package javaprog;
import java.util.*;
public class array_strings {

	public static void main(String[] args) {
		Scanner size= new Scanner(System.in);
		System.out.println("size1");
		int size1 = size.nextInt();
		System.out.println("size2");
		int size2 = size.nextInt();
		String[] array1 = new String[size1];
		String[] array2 = new String[size2];
		System.out.println("enter elents of array1:");
		for(int i=0;i<size1;i++) {
			array1[i]=size.next();
		}
		System.out.println("enter elents of array2:");
		for(int i=0;i<size2;i++) {
			array2[i]=size.next();
		}
		//printing elements of array
		for(int i=0;i<size1;i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size2;i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		//common elements
		System.out.println("commom elements are:");
		int i,j;
		for(i=0;i<size1;i++) {
			for( j=0;j<size2;j++) {
				if(array1[i].equals(array2[j])) {
					System.out.println(array1[i]);
					break;
				}
			}
		}
			
	}
	
}


