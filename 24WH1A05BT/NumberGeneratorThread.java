package javaPrograms;
import java.util.*;
class NumGeneratorThread extends Thread{
	public void run() {
		Random r = new Random();
		int num = r.nextInt(50);
		System.out.println("Generated number : " + num);
		if (num % 2 == 0) {
			new EvenThread(num).start();
		}else {
			new OddThread(num).start();
		}
	}
}

class EvenThread extends Thread{
	int num;
	EvenThread(int n){
		num = n;
	}
	public void run() {
		System.out.println("Square of " + num + " = " + num*num);
	}
}

class OddThread extends Thread{
	int num;
	OddThread(int n){
		num = n;
	}
	public void run() {
		System.out.println("Cube of "+ num + " = " + num*num);
	}
}

public class RandomNumberThread {
	public static void main(String[] args) {
		NumGeneratorThread t1 = new NumGeneratorThread();
		t1.start();
	}
}
