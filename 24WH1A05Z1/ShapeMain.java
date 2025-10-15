package interfaceDemo;

import java.util.*;

abstract class Shape {
	int a, b; 

	abstract void printArea(); 
}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		a = length;
		b = breadth;
	}

	void printArea() {
		System.out.println("Area of Rectangle: " + (a * b));
	}
}


class Triangle extends Shape {
	Triangle(int base, int height) {
		a = base;
		b = height;
	}

	void printArea() {
		System.out.println("Area of Triangle: " + (0.5 * a * b));
	}
}

class Circle extends Shape {
	Circle(int radius) {
		a = radius;
	}

	void printArea() {
		double area = 3.14 * a * a;
		System.out.println("Area of Circle: " + area);
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length and breadth of rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Shape rect = new Rectangle(l, b);
		rect.printArea();

		System.out.print("Enter base and height of triangle: ");
		int base = sc.nextInt();
		int h = sc.nextInt();
		Shape tri = new Triangle(base, h);
		tri.printArea();

		System.out.print("Enter radius of circle: ");
		int r = sc.nextInt();
		Shape cir = new Circle(r);
		cir.printArea();

		sc.close();
	}
}
