package arrays;
import java.util.Scanner;

public class CommomString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String[] string1 =sc.nextLine().split(" ");
		System.out.println("Enter second string:");
		String[] string2 =sc.nextLine().split(" ");
		sc.close();
		String[] common = new String[string1.length<string2.length?string1.length:string2.length];
		
		int i=0;
		for(String s: string1) {
			for(String q: string2) {
				if(s.equals(q)) {
					common[i] = s;
					i++;
					System.out.println(s);
				}
			}
		}
	}

}
