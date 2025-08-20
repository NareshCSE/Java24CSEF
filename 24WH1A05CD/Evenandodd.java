import java.util.Scanner;

public class evenandodd_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of integers: ");
		int x=sc.nextInt();
		int odd_sum=0,even_sum=0;
		for(int i=0;i<x;i++) {
			System.out.print("enter the integer: ");
			int num=sc.nextInt();
			if(num%2==0) {
				even_sum+=num;
			}
			else {
				odd_sum+=num;
			}
		}
		System.out.printf("The sum of even numbers is %d\nThe sum of odd numbers is %d", even_sum,odd_sum);
		sc.close();
		}

}
