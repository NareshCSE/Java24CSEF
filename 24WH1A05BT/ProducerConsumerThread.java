package javaPrograms;

class SharedBuffer {
	private int data;
	private boolean hasData = false;
	public synchronized void produce(int value) {
		while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	    data = value;
	    System.out.println("Produced: " + data);
	    hasData = true;
        notifyAll();
	}

	public synchronized void consume() {
		while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		System.out.println("Consumed: " + data);
		hasData = false;
        notifyAll();
	}
}
class ProducerThread extends Thread {
	SharedBuffer buffer;

	public ProducerThread(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.produce(i);
		}
	}
}
class ConsumerThread extends Thread {
	SharedBuffer buffer;

	public ConsumerThread(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.consume();
		}
	}
}
public class ProducerConsumer {
	 public static void main(String[] args) {
	     SharedBuffer buffer = new SharedBuffer();
	
	     ProducerThread producer = new ProducerThread(buffer);
	     ConsumerThread consumer = new ConsumerThread(buffer);
	
	     producer.start();
	     consumer.start();
	 }
}
