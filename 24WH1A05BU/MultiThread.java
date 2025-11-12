package Java;
import java.util.Random;
class Number extends Thread{
	public void run() {
		Random rand=new Random();
		int num=rand.nextInt(100);
		System.out.println("Generated number:"+num);
		if(num%2==0) {
			new Square(num).start();
		}
		else {
			new Cube(num).start();
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
class Square extends Thread{
	int number;
	Square(int n){
		number=n;
	}
	public void run() {
		System.out.println("The square of the number: "+(number*number));
	}
}
class Cube extends Thread{
	int number;
	Cube(int n){
		number=n;
	}
	public void run() {
		System.out.println("The cube of the number:"+(number*number));
	}
}
public class multiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number generator=new Number();
		generator.start();

	}

}
