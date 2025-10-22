package labprograms;

abstract class Shape {
    int a, b;  

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius, int ignored) {
        super(radius, 0);
    }


    void printArea() {
        double area = 3.14 * a * a;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Shape tri = new Triangle(6, 8);
        Shape circ = new Circle(7, 0);

        rect.printArea();
        tri.printArea();
        circ.printArea();
    }
}
