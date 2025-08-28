package intro;

import java.util.Scanner;

public class Pattern_a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int rows=sc.nextInt();
        sc.close();
        
        for(int i=1;i<=rows;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
      
        	System.out.println();
       }
	}
}
