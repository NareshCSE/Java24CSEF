package array.java;
import java.util.Scanner;

public class array3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stds1=new String[100];
		String[] stds2=new String[100];
		Scanner names=new Scanner(System.in);
		System.out.println("enter no.of names in 1:");
		int n1=names.nextInt();
		names.nextLine(); // consume leftover newline
		System.out.println("enter no.of names in 2:");
		int n2=names.nextInt();
		names.nextLine(); // consume leftover newline
//When you call names.nextInt() to read n1, it reads the integer but does not consume the newline character (\n) after the number.
//Then, when you call names.nextLine() immediately after, it reads that leftover newline as an empty string.
		
		int i,j;
		System.out.println("enter names in 1:");
		for(i=0;i<n1;i++) {
			stds1[i]=names.nextLine();
		}
		System.out.println("enter names in 2:");
		for(i=0;i<n2;i++) {
			stds2[i]=names.nextLine();
		}
		System.out.print("common names :");
		for(i=0;i<n1;i++) {
	    	  for(j=0;j<n2;j++) {
	    		  if(stds1[i].equals(stds2[j])){
	    			  System.out.println(stds1[i]);
	    		  }
	    	  }
	      }
		
	}

}
