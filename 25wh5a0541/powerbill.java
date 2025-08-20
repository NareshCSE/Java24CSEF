package demo;

public class powerbill {
	public static void main(String[] args) {
		int units=120;
		if(units<=50) {
			System.out.println(units*1);
		}
			else if(units<=100) {
				System.out.println(50*1 +(units-50)*2);
			}
			else if(units<=200) {
				System.out.println(50*1+50*2 +(units-100)*3);
			}
			else if(units<=400) {
				System.out.println(50*1+50*2+50*3+(units-200)*4);
			}
			else{
				System.out.println(50*1+50*2+50*3+50*4+(units-400)*5);
			}
	}
}
	

