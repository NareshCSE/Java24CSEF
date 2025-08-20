package java1;

import java.util.Scanner;

public class EvenOddSum {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner number=new Scanner(System.in);

		System.out.println("enter how many numbers=");

		int n=number.nextInt();

		int[] arr=new int[n];

		int i;

		for(i=0;i<n;i++) {

			System.out.println("arr"+(i+1)+'=');

			arr[i]=number.nextInt();

		}

		System.out.println("number of array are");

		for(i=0;i<n;i++) {

			System.out.println(arr[i]);

		}

		int evenSum=0,oddSum=0;

		for(i=0;i<n;i++) {

			if(arr[i]%2==0) {

				evenSum+=arr[i];

			}else if(arr[i]%2!=0) {

				oddSum+=arr[i];

			}

		}

		System.out.println("even sum="+evenSum);

		System.out.println("odd sum="+oddSum);



	}



}
