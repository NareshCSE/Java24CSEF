package assignment_problems;
import java.util.Scanner;

public class Duplicate_valuesarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements: ");
        int array_size = sc.nextInt();
        int[] array = new int[array_size];
        System.out.print("enter the array elements: ");
        for(int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the duplicate values are: ");
        int count = 0;
        for(int i = 0; i < array_size; i++) {
            for(int j = i + 1; j < array_size; j++) {
                if(array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    count++;
                    break; 
                }
            }
        }
        
        System.out.printf("\nthe number of duplicates are %d", count);
        sc.close();
    }
}
