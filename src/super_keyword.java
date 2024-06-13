// write a complete program to demonstrate the use of super keyword in java
// Sun June 01 2024

class Animal {
    protected String color = "White";
}

class Dog extends Animal {
    String color = "Black";
    void display() {
        System.out.println("Dog color : " + color);
        System.out.println("Animal color : " + super.color);
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Dog object_dog = new Dog();
        object_dog.display();
    }
}


