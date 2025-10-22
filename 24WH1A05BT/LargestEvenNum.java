package RecordProblems;
import java.util.*;
public class LargestEvenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String digits = input.replaceAll("\\D", "");
		String unique = "";
		for (int i = 0; i < digits.length(); i++) {
			char ch = digits.charAt(i);
			if (unique.indexOf(ch) == -1)
			unique += ch;
		}
		char[] arr = unique.toCharArray();
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder(new String(arr)).reverse();
		String result = "";
		for (int i = sb.length() - 1; i >= 0; i--) {
			int digit = sb.charAt(i) - '0';
			if (digit % 2 == 0) {
				result = sb.deleteCharAt(i).append(digit).toString();
				System.out.println("Largest even number: " + result);
				return;
			}
		}		
		System.out.println("Not Possible");
	}
}
