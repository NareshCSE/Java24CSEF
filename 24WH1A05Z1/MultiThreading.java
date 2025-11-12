package threading;
import java.util.*;

class RandomNumberThread extends Thread{
	public void run() {
		Random rand = new Random();
		for(int  i = 0; i < 10; i++) {
			int randInt = rand.nextInt();
			if(randInt % 2 == 0) {
				new EvenNumberThread(randInt).start();
			}
			else {
				new OddNumberThread(randInt).start();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class EvenNumberThread extends Thread{
	int num;
	EvenNumberThread(int num){
		this.num = num;
	}
	public void run() {
		int square = num*num;
		System.out.println("Square of "+num+" is "+square);
	}
}

class OddNumberThread extends Thread{
	int num;
	OddNumberThread(int num){
		this.num = num;
	}
	public void run() {
		int cube = num*num*num;
		System.out.println("Cube of "+num+" is "+cube);
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		RandomNumberThread thread = new RandomNumberThread();
		thread.start();
	}

}
