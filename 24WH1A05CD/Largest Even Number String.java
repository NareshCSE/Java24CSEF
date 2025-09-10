package javalab;

import java.util.Scanner;

public class largestevenstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                if (unique.indexOf(ch) == -1) {
                    unique += ch;
                }
            }
        }
        if (unique.isEmpty()) {
            System.out.println("-1");
            return;
        }
        int n = unique.length();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = unique.charAt(i) - '0';
        }
        int minEven = 0;
        int minIndex = -1;
        boolean foundEven = false;

        for (int i = 0; i < n; i++) {
            if (digits[i] % 2 == 0) {
                if (!foundEven) {
                    minEven = digits[i];
                    minIndex = i;
                    foundEven = true;
                } else if (digits[i] < minEven) {
                    minEven = digits[i];
                    minIndex = i;
                }
            }
        }

        if (!foundEven) {
            System.out.println("-1");
            return;
        }
        int[] remaining = new int[n - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (i != minIndex) {
                remaining[idx++] = digits[i];
            }
        }
        for (int i = 0; i < remaining.length - 1; i++) {
            for (int j = i + 1; j < remaining.length; j++) {
                if (remaining[i] < remaining[j]) {
                    int temp = remaining[i];
                    remaining[i] = remaining[j];
                    remaining[j] = temp;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int d : remaining) {
            result.append(d);
        }
        result.append(minEven);

        System.out.println("Largest even number: " + result.toString());
    }
}
