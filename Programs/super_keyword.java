// write a complete program to demonstrate the use of super keyword in java
// Sun June 01 2024

class animals {
    protected String color = "White";
}

class doggy extends animals {
    String color = "Black";
    void display() {
        System.out.println("Dog color : " + color);
        System.out.println("Animal color : " + super.color);
    }
}

public class super_keyword {
    public static void main(String[] args) {
        doggy object_dog = new doggy();
        object_dog.display();
    }
}


