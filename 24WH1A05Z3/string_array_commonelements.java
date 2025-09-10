package practiceproblems;

import java.util.Scanner;

public class String_arraycommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements in array 1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); 
        String[] array1 = new String[n1];
        System.out.println("Enter elements for array 1:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextLine();
        }

        System.out.print("Enter number of elements in array 2: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        String[] array2 = new String[n2];
        System.out.println("Enter elements for array 2:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextLine();
        }

        System.out.print("Common elements: ");
        boolean common = false;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.print(array1[i] + " ");
                    common = true;
                    break;
                }
            }
        }
        if(!common) {
        	System.out.print(" no common elements");
        }
        sc.close();
    }
}
