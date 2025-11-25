import java.util.Scanner;
public class Electricity_bill {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter old readings:");
		int old=sc.nextInt();
		System.out.println("Enter present readings:");
		int present=sc.nextInt();
		int units=present-old;
		int sum=0;
		int u=units;
		if(units<=50)
		{
			sum=units*1;
		}
		else if(units<=100)
		{
			sum=(50*1+(units-50)*2);
		}
		else if(units<=200)
		{
			sum=(50*1+50*2+(units-100)*3);
		}
		else if(units<=400)
		{
			sum=(50*1+50*2+100*3+(units-200)*4);
		}
		else
		{
			sum=(50*1+50*2+100*3+200*4+(units-400)*5);
		}
        System.out.println("Total charge for " + u + " units is " + sum );
        sc.close();
	}
}

