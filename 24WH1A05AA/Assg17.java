package intro;
import java.util.Random;
class RandomNumber extends Thread{
	public void run() {
		Random r=new Random();
		while(true) {
			int n=r.nextInt(11);
			System.out.println("Random number is"+n);
			
			if(n%2==0) {
				new Even(n).start();
			}
			else {
				new Odd(n).start();
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
class Even extends Thread {
	 int num;
	 Even(int n) {
	     this.num = n;
	 }

	 public void run() {
	     System.out.println("Square of generated number: " + num + " is" + (num * num));
	 }
}

class Odd extends Thread{
	int num;
	Odd(int n){
		this.num = n;
	}
	 public void run() {
		 System.out.println("Cube of generated number: " + num + "is" + (num*num*num));
	 }
}

public class Assg17 {

	public static void main(String[] args) {
		RandomNumber rand = new RandomNumber();
		rand.start();

	}

}
//IPC -> inter process communication
//methods in it are
//notify  --> notify only for 1 thread
//notifyAll --> all the threads will be notified

// How to stop a thread running

// use sleep(milliseconds) to temporaritly iterrupt a running thread
//yeild() gives chance to the other thread using thread scheluder which has same priority and it  becomes waiting state 
//join() --> in t2 we call t3.join() then t3 complets its job then t2 excutes 


//getPrority gives the priority of the thread priority ranges(0-10)
//setPriority we can give the priority of the thread


//synchronised --->>only one object can call a method at a time (stops concurrent access)