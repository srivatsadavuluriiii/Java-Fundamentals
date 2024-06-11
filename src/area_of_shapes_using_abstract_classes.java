/*Write a java program to create an abstract class named shape that contains two integers
and an empty method named print Area(). Provide three classes named Rectangle,
Triangle, and Circle such that each one of the classes extends the class Shape. Each one
of the classes contains only the method print Area() that prints the area of the given
shape. */
// Thu June 06, 2024

abstract class Shape {
    int a;
    int b;
    String shapeType;

    Shape(int a, int b, String shapeType) {
        this.a = a;
        this.b = b;
        this.shapeType = shapeType;
    }

    void printArea() {
        switch (shapeType) {
            case "Rectangle" -> {
                int rectArea = a * b;
                System.out.println("Area of Rectangle: " + rectArea);
            }
            case "Triangle" -> {
                double triArea = 0.5 * a * b;
                System.out.println("Area of Triangle: " + triArea);
            }
            case "Circle" -> {
                double circArea = 3.14 * a * a;
                System.out.println("Area of Circle: " + circArea);
            }
            default -> System.out.println("Unknown shape type");
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
        super(radius, 0, "Circle"); 
    }
}

public class area_of_shapes_using_abstract_classes {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 15);
        triangle.printArea();

        Shape circle = new Circle(10);
        circle.printArea();
    }
}








