
class dimensions {
    int length;
    int breadth;
    void dimensionInsert (int l, int b) {
        length = l;
        breadth = b;
    }

    void dimensionCalculate () {
        int area = length * breadth;
        System.out.printf("Area : %d", area);
    }}


public class calculating_areas_using_methods_and_instances {
    public static void main(String[] args) {
        dimensions obj1 = new dimensions();
        dimensions obj2 = new dimensions();

        obj1.dimensionInsert(10, 20);
        obj1.dimensionCalculate();
        System.out.println();
        obj2.dimensionInsert(30, 40);
        obj2.dimensionCalculate();
    }    
}
