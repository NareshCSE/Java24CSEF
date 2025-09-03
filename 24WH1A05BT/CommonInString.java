import java.util.Scanner;
public class CommonString {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the size of the first array:");
		int n1 = sc.nextInt();
		System.out.print("Enter the size of the second array:");
		int n2 = sc.nextInt();
		String[] str1 = new String[n1];
		String[] str2 = new String[n2];
		System.out.println("Enter the elements of the first array:");
		for (int i = 0; i < n1; i++) {
			str1[i] = sc.next();
		}
		System.out.println("Enter the elements of the second array:");
		for (int i = 0; i < n2; i++) {
			str2[i] = sc.next();
		}
		String[] com = new String[n1];
		int n = 0;
		for (int i = 0; i < n1; i++) {
			for(int j = 0; j < n2; j++) {
				if (str1[i] == str2[j]) {
					com[n] = str1[i];
					n += 1;
				}
			}
		}
		System.out.println("The common elements of the given two strings are:");
		for (int i = 0; i < n; i++) {
			System.out.print(com[i]+" ");
		}
	}

}
