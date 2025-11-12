package labprograms;

import java.util.Random;

public class MultiThread {

    class NumberGenerator extends Thread {
        public void run() {
            Random rand = new Random();

            for (int i = 0; i < 5; i++) {  
                int num = rand.nextInt(100);  
                System.out.println("\nGenerated Number: " + num);

                if (num % 2 == 0) {
                    new Square(num).start();  
                } else {
                    new Cube(num).start();   
                }

                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

   
    class Square extends Thread {
        int n;
        Square(int n) {
            this.n = n;
        }
        public void run() {
            System.out.println("Square of " + n + " = " + (n * n));
        }
    }

   
    class Cube extends Thread {
        int n;
        Cube(int n) {
            this.n = n;
        }
        public void run() {
            System.out.println("Cube of " + n + " = " + (n * n * n));
        }
    }

  
    public static void main(String[] args) {
        MultiThread obj = new MultiThread(); 
        NumberGenerator generator = obj.new NumberGenerator(); 
        generator.start(); 
    }
}
