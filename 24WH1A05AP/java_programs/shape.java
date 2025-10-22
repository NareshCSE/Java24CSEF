package java_programs;

public abstract class shape {
	abstract static class Shape {

        int a, b;



        Shape(int a, int b) {

            this.a = a;

            this.b = b;

        }

        abstract void printArea();

    }
    static class Rectangle extends Shape {

        Rectangle(int length, int width) {

            super(length, width);

        }
        @Override

        void printArea() {

            System.out.println("Area of Rectangle: " + (a * b));

        }

    }



    static class Triangle extends Shape {

        Triangle(int base, int height) {

            super(base, height);

        }



        @Override

        void printArea() {

            System.out.println("Area of Triangle: " + (0.5 * a * b));

        }

    }



    static class Circle extends Shape {

        Circle(int radius) {

            super(radius, 0);

        }



        @Override

        void printArea() {

            System.out.println("Area of Circle: " + (Math.PI * a * a));

        }

    }

    public static void main(String[] args) {

        Shape rect = new Rectangle(13,57);

        rect.printArea();



        Shape tri = new Triangle(75,10);

        tri.printArea();



        Shape cir = new Circle(9);

        cir.printArea();

    }

}