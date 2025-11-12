package intro;

class ItemQueue {
    private int data;
    private boolean hasItem = false; 

    
    public synchronized void produce(int value) {
        
        while (hasItem) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
        data = value;
        hasItem = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasItem) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
        System.out.println("Consumed: " + data);
        hasItem = false;
        notify();
        return data;
    }
}
class Producer extends Thread {
    private final ItemQueue queue;
    public Producer(ItemQueue queue) {
        this.queue = queue;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.produce(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread {
    private final ItemQueue queue;
    public Consumer(ItemQueue queue) {
        this.queue = queue;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.consume();
            try {
                Thread.sleep(1500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Assg20 {
    public static void main(String[] args) {
        ItemQueue queue = new ItemQueue();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
