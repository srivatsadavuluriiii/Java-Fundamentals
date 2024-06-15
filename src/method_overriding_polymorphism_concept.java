// Java program to demonstrate polymorphism : Method Overriding
// Sat June 01 2024

class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class doggo extends animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class catto extends animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class method_overriding_polymorphism_concept {
    public static void main(String[] args) {
        animal object_dog = new doggo();
        animal object_cat = new catto();
        object_dog.sound();
        object_cat.sound();
    }
}
