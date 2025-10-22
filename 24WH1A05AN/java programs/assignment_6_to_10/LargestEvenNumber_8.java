package assignment_6_to_10;

import java.util.*;

public class LargestEvenNumber_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        Set<Character> digitSet = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitSet.add(ch);
            }
        }

        List<Character> digits = new ArrayList<>(digitSet);
        digits.sort(Collections.reverseOrder());

        int evenIndex = -1;
        for (int i = digits.size() - 1; i >= 0; i--) {
            int d = digits.get(i) - '0';
            if (d % 2 == 0) {
                evenIndex = i;
                break;
            }
        }

        if (evenIndex == -1) {
            System.out.println(-1);
            scanner.close();
            return;
        }

        char evenDigit = digits.remove(evenIndex);

        StringBuilder result = new StringBuilder();
        for (char d : digits) {
            result.append(d);
        }
        result.append(evenDigit);

        System.out.println(result.toString());
        scanner.close();
    }
}
