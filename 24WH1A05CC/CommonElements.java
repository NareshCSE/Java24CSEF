package ArrayC;
import java.util.Scanner;
public class ArrayC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in); 
		
         int n1;
         System.out.println("Enter the size of array1:");
         n1=sc.nextInt();
         String[] array1=new String[n1];
         System.out.println("Enter "+ n1 +" Elements:");
         for(int i=0;i<n1;i++) {
        	 array1[i]=sc.next();
         }
         int n2;
         System.out.println("Enter the size of array2:");
         n2=sc.nextInt();
         String[] array2=new String[n2];
         System.out.println("Enter "+ n2 +" Elements:");
         for(int i=0;i<n2;i++) {
        	 array2[i]=sc.next();
         }
         boolean found=false;
         System.out.println("Common Elements are:");
         for(int i=0;i<n1;i++) {
        	 for(int j=0;j<n2;j++) {
        		 if(array1[i].equals(array2[j])) {
        			 found=true;
        			 System.out.println(array1[i]);
        			 break;
        		 }
        	 }
         }
         if(found==false) {
        	 System.out.println("No common elements found.");
         }
         
         
         
	}

}
