package javaprog;



import java.util.Scanner;



// Abstract class Shape

abstract class Shape {

    int a, b; // can be length & breadth / base & height / radius

    abstract void printArea(); // abstract method

}



// Rectangle class

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {

        a = length;

        b = breadth;

    }



    void printArea() {

        System.out.println("Rectangle Area: " + (a * b));

    }

}



// Triangle class

class Triangle extends Shape {

    Triangle(int base, int height) {

        a = base;

        b = height;

    }



    void printArea() {

        System.out.println("Triangle Area: " + (0.5 * a * b));

    }

}



// Circle class

class Circle extends Shape {

    Circle(int radius) {

        a = radius;

    }



    void printArea() {

        System.out.println("Circle Area: " + (Math.PI * a * a));

    }

}



// Main class

public class exp_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape s;



        // Rectangle Input

        System.out.print("Enter length of Rectangle: ");

        int length = sc.nextInt();

        System.out.print("Enter breadth of Rectangle: ");

        int breadth = sc.nextInt();

        s = new Rectangle(length, breadth);

        s.printArea();



        System.out.println();



        // Triangle Input

        System.out.print("Enter base of Triangle: ");

        int base = sc.nextInt();

        System.out.print("Enter height of Triangle: ");

        int height = sc.nextInt();

        s = new Triangle(base, height);

        s.printArea();



        System.out.println();



        // Circle Input

        System.out.print("Enter radius of Circle: ");

        int radius = sc.nextInt();

        s = new Circle(radius);

        s.printArea();



        sc.close();

    }

}
