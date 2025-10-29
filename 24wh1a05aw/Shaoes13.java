package csef5aw;

	abstract class Shape {
	    int a, b;
	    abstract void printArea();
	}

	class Rectangle extends Shape {
	    Rectangle(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }
	    void printArea() {
	        System.out.println("Rectangle Area: " + (a * b));
	    }
	}

	class Triangle extends Shape {
	    Triangle(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }
	    void printArea() {
	        System.out.println("Triangle Area: " + (0.5 * a * b));
	    }
	}

	class Circle extends Shape {
	    Circle(int radius) {
	        this.a = radius;
	    }
	    void printArea() {
	        System.out.println("Circle Area: " + (3.14 * a * a));
	    }
	}

	public class Shapes {
	    public static void main(String[] args) {
	        Rectangle r = new Rectangle(10, 20);
	        Triangle t = new Triangle(10, 15);
	        Circle c = new Circle(5);

	        r.printArea();
	        t.printArea();
	        c.printArea();
	    }
	}

package csef5aw;

public class Main {
    public static void main(String[] args) {
        CreditChecker checker = new CreditChecker();

        try {
            checker.checkCreditsInCourse(40);  // Will throw exception
        } catch (CreditsNotSufficientException e) {
            System.out.println(e.getMessage());
        }

        try {
            checker.checkCreditsInProgram(60);  // Will pass
        } catch (CreditsNotSufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
