package demo;
public class calculator{
	public static void main (String[] args) {
		int a=100;
		int b=2000;
		int choice=5;
		switch(choice) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
		}
	}
}

