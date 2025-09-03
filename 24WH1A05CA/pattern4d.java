package demo;

public class pattern3 {

	public static void main(String[] args) {
		
				for(int i=1;i<=5;i++) {
					int j=1;
					for(j=1;j<=(5-i);j++) {
						System.out.print("  ");
					}
					int k=1;
					for(k=1;k<=i;k++) {
						System.out.print(k+" ");
					}
					for(int n=i-1;n>=1;n--) {
						System.out.print(n+" ");
					}
					System.out.println();
				}

			}
}
