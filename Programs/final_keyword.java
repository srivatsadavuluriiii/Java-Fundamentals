// Java complex program to demonstrate the use of final keyword in java
// Sun June 01 2024

class type {
    final void display() {
        System.out.println("This is a type");
    }
}

class typer extends type {}

public class final_keyword {
    public static void main(String[] args) {
        typer object = new typer();
        object.display();
    }
}
