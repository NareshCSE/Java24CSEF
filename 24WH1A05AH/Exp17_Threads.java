import java.util.Random;

class RandomNum extends Thread{
	public void run() {
		Random rand = new Random();
		for(int i=0;i<5;i++) {
			int num=rand.nextInt(100) ;
			System.out.println("Generatednumber: " + num);

		if(num%2==0) {
			EvenNum even = new EvenNum(num);
			even.start();
		}
		else {
			OddNum odd = new OddNum(num);
			odd.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class EvenNum extends Thread {
	int num;
	public EvenNum(int num) {
		this.num=num;
	}
	
	public void run() {	
		int sum = num*num;
		System.out.println("Square of number:" + sum + "\n");
	}
}

class OddNum extends Thread {
	int num;
	public OddNum(int num) {
		this.num=num;
	}

	public void run() {
		int sum = num*num*num;
		System.out.println("Cube of number:" + sum + "\n");
	}
}

public class Exp17_Threads {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNum rn = new RandomNum();
		rn.start();
		}
}

