import java.util.Scanner;

public class Sum_of_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int evensum=0;
		int oddsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of integers:");
		int n=sc.nextInt();
		System.out.println("Enter the Set of integrs:");
		for(int i=1;i<=n;i++) {
			num=sc.nextInt();
			if(num%2==0) {
				evensum+=num;
			}
			else {
				oddsum+=num;
			}
		}
		System.out.println("Evensum="+evensum);
		System.out.println("Oddsum="+oddsum);

	}

}
