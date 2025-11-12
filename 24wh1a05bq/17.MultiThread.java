package projects;
import java.util.Random;
import java.util.random.*;
class RandomGeneration extends Thread{
	public void run() {
	    Random rand=new Random();
	    for(int  i=0;i<5;i++) {
	    	int num=rand.nextInt(20);
	    	System.out.println("\nGenerated number: " + num);
	    	if(num%2==0) {
	    		new SquareNumber(num).start();
	    	}else {

	    		new CubeNumber(num).start();
	    	}
	    	try {
                Thread.sleep(1000); // wait 1 second before next number
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
	    }

	  }
}
class SquareNumber extends Thread{
	int num;
	SquareNumber(int num){
		this.num=num;
	}
	public void run() {
		System.out.println("Square of "+ num +" :"+ (num*num));
	}
}
class CubeNumber extends Thread{
	int num;
	CubeNumber(int num){
		this.num=num;
	}
	public void run() {
		System.out.println("Cube of "+ num +" :"+ (num*num*num));
	}
}
public class MultiThread {
	public static void main(String[] args) {
		RandomGeneration number=new RandomGeneration();
		number.start();
	}
}
