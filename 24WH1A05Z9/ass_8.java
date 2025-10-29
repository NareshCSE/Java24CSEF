package intro;
import java.util.*;

public class ass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        String digits = ""; 

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch) && digits.indexOf(ch) == -1) {
                digits += ch;
            }
        }

        if (digits.equals("")) {
            System.out.println(-1);
            return;
        }

        String sorted = "";
        for (char d = '9'; d >= '0'; d--) {
            if (digits.indexOf(d) != -1) {
                sorted += d;
            }
        }

        char lastEven = 0;
        for (int i = sorted.length() - 1; i >= 0; i--) {
            char ch = sorted.charAt(i);
            if ((ch - '0') % 2 == 0) {
                lastEven = ch;
                break;
            }
        }

        if (lastEven == 0) {
            System.out.println(-1);
            return;
        }

        String result = "";
        boolean used = false;
        for (int i = 0; i < sorted.length(); i++) {
            char ch = sorted.charAt(i);
            if (ch == lastEven && !used) {
                used = true; 
            } else {
                result += ch;
            }
        }
        result += lastEven;

        System.out.println(result);
		

	}

}
