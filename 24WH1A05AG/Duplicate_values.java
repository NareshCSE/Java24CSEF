import java.util.Scanner;
public class ArrayDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter values of array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (array[k] == array[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (alreadyPrinted==false) {
                        System.out.print(array[i]+" ");
                    }
                    break;
                }
            }
        }
        sc.close();
    }
}
