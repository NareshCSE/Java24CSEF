import java.util.Scanner;
public class Triangle_Pattern {
	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=number.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
            System.out.println();
		}
	}
}


