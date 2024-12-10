// same name - class and method -> pass arguments while creating objects

class construct {
    int id;
    String name;
    String address;

    construct(int a, String b, String c) {
        id = a;
        name = b;
        address = c;
    }

    void display() {System.out.println(id + " " + name + " " + address);}

}

public class constructors_with_arguments {
    public static void main(String[] args) {
        construct obj_1 = new construct(1,"sri","abc");
        obj_1.display();
        construct obj_2 = new construct(2,"deb","def");
        obj_2.display();
        
    }
}
