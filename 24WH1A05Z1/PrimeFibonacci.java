package interfaceDemo;
import java.util.*;

public class PrimeFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Prime Fibonacci numbers up to " + n + " are: ");

        int a = 0, b = 1;
        while (a <= n) {
            if (isPrime(a))
                System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
