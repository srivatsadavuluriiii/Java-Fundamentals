/*Write a java program to create an abstract class named shape that contains two integers
and an empty method named print Area(). Provide three classes named Rectangle,
Triangle, and Circle such that each one of the classes extends the class Shape. Each one
of the classes contains only the method print Area() that prints the area of the given
shape. */
// Thu June 06, 2024


abstract class Shape {
    int dimension1;
    int dimension2;

    // Abstract method to print area
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        this.dimension1 = radius;
        this.dimension2 = 0; // Not used in Circle
    }

    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class  {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 15);
        triangle.printArea();

        Shape circle = new Circle(10);
        circle.printArea();
    }
}
