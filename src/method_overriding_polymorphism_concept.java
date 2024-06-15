// Java program to demonstrate polymorphism : Method Overriding
// Sat June 01 2024

class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dog extends animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class cat extends animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class method_overriding_polymorphism_concept {
    public static void main(String[] args) {
        animal object_dog = new dog();
        animal object_cat = new cat();
        object_dog.sound();
        object_cat.sound();
    }
}
