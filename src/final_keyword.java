// Java complex program to demonstrate the use of final keyword in java
// Sun June 01 2024

class Animal {
    final void display() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {}

public class final_keyword {
    public static void main(String[] args) {
        Dog object_dog = new Dog();
        object_dog.display();
    }
}
