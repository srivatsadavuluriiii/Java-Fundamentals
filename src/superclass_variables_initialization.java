/*
Create a superclass with variable a (initialize a with a parameterized
constructor). A subclass extends superclass and contains variable b(initialize
b with a parameterized constructor) A subclass extends subclass and contains
variable c (Initialize c with a parameterized constructor). Create an object for
subclass and demonstrate how all the superclass variables are initialized.
 */
// Thu June 13 2024

class superclass {
    int a;
    superclass(int a) {
        this.a = a;
    }
}

class subclass_a extends superclass {
    int b;
    subclass_a(int a, int b) {
        super(a);
        this.b = b;
    }
}

class subclass_b extends subclass_a {
    int c;
    subclass_b(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
}
public class superclass_variables_initialization {
    public static void main(String[] args) {

        System.out.println("Question 1 output : ");
        System.out.println();

        subclass_b object = new subclass_b(10, 20, 30);
        System.out.println("a = " + object.a);
        System.out.println("b = " + object.b);
        System.out.println("c = " + object.c);
    }
    
}
