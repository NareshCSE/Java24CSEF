package JavaLabPrograms;

class ItemQueue{
	    private int number;

		public synchronized void produce(int num) {
	        this.number = num;
	        System.out.println("Produced: " + num);
	        notify(); 
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public synchronized int consume() {
	        System.out.println("Consumed: " + number);
	        notify(); 
	        try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        return number;
	    }
	}

	class Produce extends Thread {
	    private ItemQueue item;

	    public Produce(ItemQueue item) {
	        this.item = item;
	    }

	    public void run() {
	        for (int i = 1; i <= 5; i++) { 
	            synchronized (item) {
	                item.produce(i);
	                try {
	                    item.wait(); 
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}

	class Consume extends Thread {
	    private ItemQueue item;

	    public Consume(ItemQueue item) {
	        this.item = item;
	    }

	    public void run() {
	        for (int i = 1; i <= 5; i++) { 
	            synchronized (item) {
	                item.consume();
	                try {
	                    item.wait(); 
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}

	public class Exp20_Producerconsumer {
	    public static void main(String[] args) {
	        ItemQueue item = new ItemQueue();
	        
	        Produce producer = new Produce(item);
	        Consume consumer = new Consume(item);
	        
	        producer.start();
	        consumer.start();
	    }
	}
