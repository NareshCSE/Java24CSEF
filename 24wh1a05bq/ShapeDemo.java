package projects;

abstract class Shape {
    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    @Override
    void printArea() {
        double area = 3.14 * dim1 * dim1;
        System.out.println("Circle Area: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        r.printArea();

        Shape t = new Triangle(6, 8);
        t.printArea();

        Shape c = new Circle(7);
        c.printArea();
    }
}

