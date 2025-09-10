import java.util.*;
public class DuplicateArray {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int size = read.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements:");
		
		for(int i=0;i<size;i++) {
			arr[i] = read.nextInt();
		}
		boolean hasDuplicates = false;
		System.out.println("Duplicate values are:");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]+" ");
					hasDuplicates = true;
					break;
				}
			}
		}
		if(!hasDuplicates) {
			System.out.println("None");
		}
		read.close();

	}

}
