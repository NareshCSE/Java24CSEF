package labprograms;

import java.util.Scanner;

public class twomatrices {
	public static void main(String[] args) {
	
	
	int n;

    try(Scanner input = new Scanner(System.in)){;

    System.out.println("Enter no of elemnets");

    n=input.nextInt();

    int arr1[][]=new int[n][n];

    int arr2[][]=new int[n][n];

    

   

    System.out.println("Enter 1st Array elements:");

    for(int i=0 ;i<n;i++) {

       for(int j=0;j<n;j++){

    	  arr1[i][j]=input.nextInt();

      }

    }

    System.out.println("Enter 2nd Array elements:");

    for(int i=0 ;i<n;i++) {

    	for(int j=0;j<n;j++) {

    		arr2[i][j]=input.nextInt();

    	}

    	

    }

    int arr3[][]=new int[n][n];

    for(int i=0;i<n;i++) {

    	for(int j=0;j<n;j++) {

    		for(int k=j;k<n;k++) {

    			arr3[i][j]+=arr1[i][k]*arr2[k][j];

    		}

    	}

    }

    for(int i=0 ;i<n;i++) {

    	for(int j=0;j<n;j++) {

    		System.out.print(arr3[i][j]+" ");

    	}

    	System.out.println();
    	
    }

    }

  }
}


    
    
    

    



 
