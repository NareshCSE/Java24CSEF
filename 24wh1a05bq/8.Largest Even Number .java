package projects;
import java.util.*;
public class largeevennumber {
	
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the string: ");
		        String input = sc.nextLine();

		        // Step 1: Extract digits & remove duplicates using Set
		        Set<Character> set = new HashSet<>();
		        for (char ch : input.toCharArray()) {
		            if (Character.isDigit(ch)) {
		                set.add(ch);
		            }
		        }

		        // If no digits
		        if (set.isEmpty()) {
		            System.out.println(-1);
		            return;
		        }

		        // Step 2: Convert set to list for sorting
		        List<Character> digits = new ArrayList<>(set);

		        // Step 3: Sort in descending order
		        digits.sort(Collections.reverseOrder());

		        // Step 4: Find smallest even digit (to put at last)
		        Character evenDigit = null;
		        for (int i = digits.size() - 1; i >= 0; i--) {
		            if ((digits.get(i) - '0') % 2 == 0) {
		                evenDigit = digits.remove(i);
		                break;
		            }
		        }

		        // Step 5: If no even digit found → -1
		        if (evenDigit == null) {
		            System.out.println(-1);
		            return;
		        }

		        // Step 6: Build the number
		        StringBuilder sb = new StringBuilder();
		        for (char d : digits) {
		            sb.append(d);
		        }
		        sb.append(evenDigit);

		        System.out.println("Largest Even Number: " + sb.toString());
		    }
		

	}


