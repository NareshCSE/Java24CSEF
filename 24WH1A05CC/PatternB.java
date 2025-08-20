package patternb;

public class Patternb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			int j=1;
			for( j=1;j<=(5-i);j++) {
				System.out.print("  ");
			}
			for(int k=j;k<=5;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
