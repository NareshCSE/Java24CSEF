public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{1,0},{1,0}};
		int res[][]=new int[2][2];
		int i,j,k;
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				res[i][j]=0;
				for(k=0;k<2;k++) {
					res[i][j]+=a[i][k]*b[k][j];
				}
			}
			
		}
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		}
}
