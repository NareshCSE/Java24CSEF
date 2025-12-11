package assignment_problems;
import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        
        String reversestr = "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            reversestr += str.charAt(i);
        }
        
        if(str.equals(reversestr)) {
            System.out.println("given string is a palindrome");
        }
        else {
            System.out.println("string is not a palindrome");
        }
        
        scanner.close();
    }
}
