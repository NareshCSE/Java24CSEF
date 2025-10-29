package projects;
import java.util.Scanner;
public class primenumbers {
		    // Function to check prime
		    public static boolean isPrime(int num) {
		        if (num <= 1) return false;
		        for (int i = 2; i * i <= num; i++) {
		            if (num % i == 0) return false;
		        }
		        return true;
		    }
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter n: ");
		        int n = sc.nextInt();
		        int a = 0, b = 1;
		        System.out.print("Prime numbers in Fibonacci series up to " + n + ": ");
		        // Generate Fibonacci numbers until n
		        while (a <= n) {
		            if (isPrime(a)) {
		                System.out.print(a + " ");
		            }
		            int c = a + b;
		            a = b;
		            b = c;
		        }
		        sc.close();
		    }
}
