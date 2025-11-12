package threads;
import java.util.Random;
class NumberGenerator extends Thread{
	public void run() {
		Random random=new Random();
		for(int i=0;i<5;i++) {
			int number=random.nextInt(100);
			System.out.println("The number generated is:"+number);
			if(number%2==0) {
				new SquareThread(number).start();
				
			}
			else {
				new CubeThread(number).start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
				
			}
			
			
		}
		
		
	}
	
}
class SquareThread extends Thread{
	int num1;
	public SquareThread(int num1) {
		this.num1=num1;
	}
	public void run() {
		System.out.println("The Square of a number is:"+(num1*num1));
		
	}
}
class CubeThread extends Thread{
	int num2;
	public CubeThread(int num2) {
		this.num2=num2;
	}
	public void run() {
		System.out.println("The cube of a number is:"+(num2*num2*num2));
		
	}
}
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            NumberGenerator n=new NumberGenerator();
            n.start();
	}

}
