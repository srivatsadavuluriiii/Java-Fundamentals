class volumeFinder {
    int a,l,b,h;

    public volumeFinder(int edge) {
        a = edge;
        System.out.println((int) Math.pow(a, 3));
    }

    public volumeFinder (int length, int breadth, int height) {
        l = length;
        b = breadth;
        h = height;
        System.out.println(l * b * h);
    }    
}



public class constructor_overloading {
    public static void main(String[] args) {
        new volumeFinder(5);
        new volumeFinder(1, 2, 3);  
    }    
}
