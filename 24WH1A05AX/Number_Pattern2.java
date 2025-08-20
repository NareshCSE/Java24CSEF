package javaprog;
import java.util.Scanner;
public class Number_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		System.out.println("enter number:");
		int n=number.nextInt();
		int i,j,s;
		for(i=1;i<=n;i++) {
			for(s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(j=i-1;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
