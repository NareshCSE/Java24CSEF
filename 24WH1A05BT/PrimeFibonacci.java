import java.util.Scanner;
public class PrimeFibonacci {
	private static Scanner sc;
	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int next = a + b;
		while(next < n) {
			if (isPrime(next)) {
				System.out.print(next+" ");
			}
			a = b;
			b = next;
			next = a+b;
		}

	}

}
