import java.util.Scanner;
public class Triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		System.out.println("enter number");
		int n=number.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
