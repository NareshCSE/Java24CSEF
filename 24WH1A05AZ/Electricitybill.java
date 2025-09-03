package az;
import java.util.Scanner;

public class Electricitybill 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int oldreading = scanner.nextInt();
		int newreading = scanner.nextInt();
		int units = oldreading-newreading;
		int bill=0;
		if(units<=50)
		{
			bill=50*1;
		}
		else if(units<=100)
		{
			bill=(50*1)+(units-50)*2;
		}
		else if(units<=200)
		{
			bill=(50*1)+(50*2)+(units-100)*3;
		}
		else if(units<=400)
		{
			bill=(50*1)+(50*2)+(100*3)+(units-200)*4;
		}
		else
		{
			bill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;
		}
        System.out.println(bill);
        scanner.close();
	}

}
