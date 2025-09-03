package projectsAR;

import java.util.Scanner;

class duplicateInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("enter array size");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		
          
         System.out.println("enter array elements");
          for(int i=0;i<size;i++) {
              arr[i]=scanner.nextInt();
              
              
          }
          System.out.println("duplicates are");
          for(int i=0;i<size;i++) {
        	 for(int next=i+1;next<size;next++) {
        	  if(arr[i]==arr[next]) {
        		  System.out.println(arr[i]);
        		  break;
        	  }
        	  
          }
          scanner.close();
          }
	


}
}
