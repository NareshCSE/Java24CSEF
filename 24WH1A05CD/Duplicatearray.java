package javalab;

import java.util.Scanner;
public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         int arr[]= {1,2,3,4,5,2,3,4,6};
		         System.out.println("Duplicate values");
		         for(int i=0;i<arr.length;i++) {
		        	 for (int j = i + 1; j < arr.length; j++) {
		                 if (arr[i] == arr[j]) {
		                     System.out.print(arr[i] + " ");
		                     break;
		                 }
		             }
		         
		         } 
		         }	
        	}
