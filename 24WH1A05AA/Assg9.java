package intro;

import java.util.Scanner;

public class Assg9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int temp=0;
		int nums[]= {};
		boolean flag=false;
		int fib[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println(a);
			fib[i]=a;
			temp=a+b;
			a=b;
			b=temp;
		}
		for(int i=1;i<=n;i++) {
			if (n < 2) {
				flag=false;
			}
	        for (int j = 2; j <= Math.sqrt(n); j++) {
	            if (n % j == 0) {
	            	flag=false;
	        }
	        flag=true;
			} 
			
		}
		
	}

}
