// Java program to demonstrate polymorphism : Method Overriding
// Sat June 01 2024

class class_animals { void sound() { System.out.println("Animal makes a sound"); } }

class doggo extends class_animals { @Override void sound() { System.out.println("Dog barks"); } }

class catto extends class_animals { @Override void sound() { System.out.println("Cat meows"); } }

public class method_overriding_polymorphism_concept {
    public static void main(String[] args) {
        class_animals object_dog = new doggo();
        class_animals object_cat = new catto();
        object_dog.sound();
        object_cat.sound();
    }
}
