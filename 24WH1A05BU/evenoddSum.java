import java.util.Scanner;
public class evenoddSum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("Enter n value: ");
		n=scanner.nextInt();
		int sumEven=0;
		int oddSum=0;
		for(int i=1;i<=n;i++) {
			System.out.print("Enter "+i+" value: ");
			int num=scanner.nextInt();
			if(num%2==0)
			{
				sumEven+=num;
				
			}
			else
			{
				oddSum+=num;
				
			}
		}
		System.out.println(sumEven+"is sum of even numbers");
		System.out.println(oddSum+"is sum of odd numbers");

	}

}
