import java.util.Scanner;
public class ArrayDup {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			int temp = 0;
			for (int j = i+1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int[] dup = new int[size];
		int n = 0;
		for(int i = 0; i < size-1; i++) {
			if (arr[i] == arr[i+1]) {
				if(n == 0 || dup[n-1] != arr[i]) {
					dup[n] = arr[i];
					n += 1;
				}
			}
		}
		System.out.println("The duplicate elements are:");
		if (n==0) {
			System.out.println("NULL");
		}
		else {
			for(int i = 0; i < n; i++) {
				System.out.print(dup[i]+" ");
			}
		}
	}
}
