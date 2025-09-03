package javaprograms;
import java.util.Scanner;
public class Currentbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter old reading: ");
		int oldreading=sc.nextInt();
		System.out.println("enter new reading: ");
		int newreading=sc.nextInt();
		int unit=newreading-oldreading;
		int bill=0;
		if(unit<=50) {
			bill=unit*1;
		}
		else if(unit<=100) {
			bill=50*1+((unit-50)*2);
		}
		else if(unit<=200) {
			bill=50*1+50*2+((unit-100)*3);
		}
		else if(unit<=400) {
			bill=50*1+50*2+100*3+((unit-200)*4);
		}
		else {
			bill=50*1+50*2+100*3+200*4+((unit-400)*5);
		}
		System.out.println("no. of units: "+unit);
		System.out.println("total bill: "+bill);
		}
}
