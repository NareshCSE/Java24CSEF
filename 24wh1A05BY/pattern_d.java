package file1;

public class pattern4 {
	public static void main(String[] args) {
		int i,j,k,a;
		for(i=5,k=1;i>0;i--,k++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(a=1;a<=k;a++) {
				System.out.print(a);
			}
			for(a=k-1;a>0;a--) {
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}

}
