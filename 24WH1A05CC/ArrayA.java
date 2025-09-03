package arrays;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the size of the array:");
         int size=sc.nextInt();
         int[] numbers=new int[size];
         System.out.println("Enter "+size+" elements:");
         for(int i=0;i<size;i++) {
        	 numbers[i]=sc.nextInt();
        	 
         }
         System.out.print("You entered:");
         for(int num:numbers) {
        	 System.out.print(num+" ");
         }
         System.out.println();
         sc.close();
         System.out.print("Duplicate values are:");
         boolean foundDuplicate=false;
         for(int i=0;i<size;i++) {
        	 int cnt=0;
        	 for(int j=0;j<size;j++) {
        		 if(numbers[i]==numbers[j]) {
        			 cnt++;
        		 }
        	 }
        	 if(cnt>1) {
        		 boolean alreadyPrinted=false;
        		 for(int k=0;k<i;k++) {
        			 if(numbers[k]==numbers[i]) {
        				 alreadyPrinted=true;
        				 break;
        			 }
        		 }
        		 if(!alreadyPrinted) {
        			 System.out.print(numbers[i]+" ");
        			 foundDuplicate=true;
        		 }
        		 
        	 }
        	
         }
         if(!foundDuplicate) {
        	 System.out.println("No Duplicates Found.");
         }
         
	}

}
