package javaprog;
import java.util.Scanner;
public class Diamond_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		System.out.println("enter number");
		int n=number.nextInt();
		int i,j,s,k;
		for(i=1;i<=n;i++) {
			for(s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--) {
			for(s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}

	}

}
