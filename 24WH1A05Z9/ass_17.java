package intro;
import java.util.Random;

class SharedData {
    int number;
    boolean isEven;
    boolean newNumber = false;
}

class NumberGenerator extends Thread {
    private final SharedData data;
    private final Random random = new Random();

    public NumberGenerator(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                data.number = random.nextInt(100) + 1; // Random 1–100
                data.isEven = data.number % 2 == 0;
                data.newNumber = true;

                System.out.println("\nGenerated number: " + data.number);

                data.notifyAll(); // Notify waiting threads
            }

            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    private final SharedData data;

    public SquareThread(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                while (!data.newNumber) {
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (data.isEven) {
                    int num = data.number;
                    System.out.println("Square of " + num + " is " + (num * num));
                }

                data.newNumber = false;
            }
        }
    }
}

class CubeThread extends Thread {
    private final SharedData data;

    public CubeThread(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                while (!data.newNumber) {
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (!data.isEven) {
                    int num = data.number;
                    System.out.println("Cube of " + num + " is " + (num * num * num));
                }

                data.newNumber = false;
            }
        }
    }
}
public class ass_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedData data = new SharedData();

        Thread generator = new NumberGenerator(data);
        Thread squareThread = new SquareThread(data);
        Thread cubeThread = new CubeThread(data);

        generator.start();
        squareThread.start();
        cubeThread.start();

	}

}
