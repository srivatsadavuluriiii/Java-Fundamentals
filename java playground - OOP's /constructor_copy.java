class studentInfo {
    int id;
    String name;

    public studentInfo (int i, String n) { id =  i; name = n; }
    studentInfo(studentInfo a) { id = a.id; name = a.name; }    
    void display() {System.out.println(id + " " + name);}
}


public class constructor_copy {
    public static void main(String[] args) {
        studentInfo obj1 = new studentInfo(1, "sri");
        studentInfo obj2 = new studentInfo(obj1);

        obj1.display();
        obj2.display();
    }
}