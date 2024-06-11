/*Write a java program to create an abstract class named shape that contains two integers
and an empty method named print Area(). Provide three classes named Rectangle,
Triangle, and Circle such that each one of the classes extends the class Shape. Each one
of the classes contains only the method print Area() that prints the area of the given
shape. */
// Thu June 06, 2024


abstract class Shape {
    int dimension1;
    int dimension2;

    // Type identifier to determine the shape
    String shapeType;

    Shape(int dimension1, int dimension2, String shapeType) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.shapeType = shapeType;
    }

    void printArea() {
        switch (shapeType) {
            case "Rectangle":
                int rectArea = dimension1 * dimension2;
                System.out.println("Area of Rectangle: " + rectArea);
                break;
            case "Triangle":
                double triArea = 0.5 * dimension1 * dimension2;
                System.out.println("Area of Triangle: " + triArea);
                break;
            case "Circle":
                double circArea = Math.PI * dimension1 * dimension1;
                System.out.println("Area of Circle: " + circArea);
                break;
            default:
                System.out.println("Unknown shape type");
                break;
        }
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width, "Rectangle");
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height, "Triangle");
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0, "Circle"); // dimension2 is not used for Circle
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 15);
        triangle.printArea();

        Shape circle = new Circle(10);
        circle.printArea();
    }
}