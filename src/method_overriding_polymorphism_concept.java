// Java program to demonstrate polymorphism : Method Overriding
// Sat June 01 2024

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class method_overriding_polymorphism_concept {
    public static void main(String[] args) {
        Animal object_dog = new Dog();
        Animal object_cat = new Cat();
        object_dog.sound();
        object_cat.sound();
    }
}
