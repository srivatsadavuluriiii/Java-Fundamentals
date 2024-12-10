

public class instanceClass {
    //instance variables
    int id = 1;
    String name = "java";
    int address;

    public static void main(String[] args) {
        //creating objects
        instanceClass object_1 = new instanceClass();
        System.out.println(object_1.id);
        System.out.println(object_1.name);
        //assigning value to pre defined object - by refernce
        object_1.address = 123;
        System.out.println(object_1.address);
        //creating new object
        instanceClass object_2 = new instanceClass();
        System.out.println(object_2.id);
        object_2.id = 12;
        System.out.println(object_2.id);

    }
}