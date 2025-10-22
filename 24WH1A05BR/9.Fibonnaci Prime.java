package labprograms;
import java.util.Scanner;

public class Fibonacci {

    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a <= num) {
            if (a == num)
                return true;
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Prime Fibonacci numbers up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) && isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
