package demo;
import java.util.Random;
//Thread1
class NumberGenerate extends Thread{
	public void run() {
		Random random=new Random();
		for(int i=1;i<=10;i++){
			int num=random.nextInt(100);
			System.out.println(num);
			if(num%2==0) {
				new SquareThread(num).start();
			}
			else {
				new CubeThread(num).start();
			}
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//Thread2-prints square if the number is even..
class SquareThread extends Thread{
	private final int number;
	SquareThread(int number){
	this.number=number;
	}
	public void run() {
		int Square=number*number;
		System.out.println("Square of the number "+number+" is: "+Square);
	}
	
}
//Thread3-prints cube if the number is odd...
class CubeThread extends Thread{
	private final int number;
	CubeThread(int number){
		this.number=number;
	}
	public void run() {
		int Cube=number*number*number;
		System.out.println("Cube of the number "+number+" is: "+Cube);
	}
}
public class MultiThread {
	public static void main(String[] args) {
		NumberGenerate generator = new NumberGenerate();
        generator.start();

	}
}
