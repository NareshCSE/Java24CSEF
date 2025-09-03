package javaprog;
import java.util.Scanner;
public class Reverse_triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number= new Scanner(System.in);
		System.out.print(" enter num:");
		int n=number.nextInt();
		int i,j,s;
		for(i=1;i<=n;i++) {
			for(s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
