
public class pattrern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l,n=5;
        for(i=1;i<=n;i++) {
           for(j=n-i;j>=1;j--) {
     	     System.out.print(" ");
     	   }
     	   for(k=1;k<=i;k++) {
     		 System.out.print(k);
     	   }
     	  for(l=i-1;l>=1;l--) {
       	   System.out.print(l);
          }
           System.out.println();
 	     }
         
	}

}
