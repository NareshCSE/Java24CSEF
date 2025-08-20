package file1;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k,a,i,j;
		for( i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
					
				    System.out.print(" ");
				}
				for( k=1;k<=2*i-1;k++) {
					System.out.print("*");
				}
			
			System.out.print("\n");
		}
			for(i=4,k=0;i>=0;i--,k++) {
				for(a=0;a<=k;a++) {
					System.out.print(" ");
				}
				for(j=2*i-1;j>0;j--) {
					System.out.print("*");
				}
				System.out.print("\n");
			}

		}


	}


