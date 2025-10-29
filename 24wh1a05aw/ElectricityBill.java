package csef5aw;
	import java.util.Scanner;

	public class Electricitybill {



		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Scanner reading=new Scanner(System.in);

			System.out.println("old reading=");

			int oldReading=reading.nextInt();

			System.out.println("new reading=");

			int newReading=reading.nextInt();

			int units=oldReading-newReading;

			int bill=0;

			

			

			if( units<= 50) {

				bill=50*1;

			}else if(units<=100) {

				bill=(50*1)+(units-50)*2;

			}else if(units<=200) {

				bill=(50*1)+(50*2)+(units-100)*3;

			}else if(units<=400) {

				bill=(50*1)+(50*2)+(100*3)+(units-200)*4;

			}else if(units>400) {

				bill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;

			}

			System.out.println("bill="+bill);



		}



	}


