package projectsAR;
import java.util.Scanner;
class commonInput2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner=new Scanner(System.in);


      System.out.println("Enter array1 size");
      int size_1=scanner.nextInt();
      System.out.println("Enter array2 size");
      int size_2=scanner.nextInt();
	  int array1[]=new int[size_1];
	  int array2[]=new int[size_2];
      System.out.println("enter array1 elements:");
      for(int i=0;i<array1.length;i++) {
    	  array1[i]=scanner.nextInt();
      }
      System.out.println("Enter array2 elements:");
      for(int j=0;j<array2.length;j++) {
    	  array2[j]=scanner.nextInt();
      }
      System.out.println("Commmon elements are:");
      for(int i=0;i<array1.length;i++) {
    	  for(int j=0;j<array2.length;j++) {
    		  if(array1[i]==array2[j]) {
    			  System.out.println(array1[i]);
    		  }
    	  }
      }
      scanner.close();
	}

}
