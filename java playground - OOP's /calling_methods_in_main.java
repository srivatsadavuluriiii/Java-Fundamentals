class calculateArea {
    void displayArea (int a, int b) {
        System.out.println(a * b);
    }
}


public class calling_methods_in_main {
    public static void main(String[] args) {
        calculateArea sc = new calculateArea();
        sc.displayArea(5, 9);
    }
    
}
