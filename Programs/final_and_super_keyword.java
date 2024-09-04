// Java program to implement the use of final keyword and super keyword in java
// Tue June 11 2024
class Animal {
    final void display() {System.out.println("This is an animal");}
    void sound() {System.out.println("Animal makes a sound");}
}

class Dog extends Animal {

    void displayInfo() {
        super.display();
        System.out.println("Specifically, this is a dog");
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class final_and_super_keyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.displayInfo();
        myDog.sound();
    }
}