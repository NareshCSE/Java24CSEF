package assignment_problems;

public class Pattern2second {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
