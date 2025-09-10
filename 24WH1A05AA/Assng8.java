package intro;

import java.util.Scanner;

public class Assng8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String nums = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9') {
				nums+=s.charAt(i);
			}
			
		}
		System.out.println(nums);
		
		sc.close();

	}

}
