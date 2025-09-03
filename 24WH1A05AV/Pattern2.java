import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = read.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		read.close();

	}

}
