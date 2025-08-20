package demo;

import java.util.Scanner;

public class electricitybill{
	
 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter old meter reading: ");
	        int oldReading = scanner.nextInt();
	        System.out.print("Enter current meter reading: ");
	        int currentReading = scanner.nextInt();
	        int consumedunits=currentReading-oldReading;
	        double billamount=0;
			if(consumedunits<50) {
	        	billamount=50*1;
	        	System.out.println(billamount);
	        }
	        else if(consumedunits>50 && consumedunits<100)
	        {
	        	billamount=((50*1)+(consumedunits-50)*2);
	        	System.out.println(billamount);
	        }
	        else if(consumedunits>100 && consumedunits<200)
	        {
	        	billamount=((50*1)+(50*2)+((consumedunits-100)*3));
	        	System.out.println(billamount);
	        }
	        else if(consumedunits>200 && consumedunits<400)
	        {
	        	billamount=((50*1)+(50*2)+(50*3)+(consumedunits-200)*4);
	        	System.out.println(billamount);
	        }
	        else if(consumedunits>400) {
	        	billamount=((50*1)+(50*2)+(50*3)+(50*4)+(consumedunits-400)*5);
	        	System.out.println(billamount);
	        }
		return;
	}
}
