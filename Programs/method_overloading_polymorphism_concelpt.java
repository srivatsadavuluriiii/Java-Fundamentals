// java program to understand method overloading in polymorphism
// Sat June 01 2024


class volume_finder {
    static int volume (int a, int b) {return (int) Math.pow(a, 3);}
    static int volume (int a, int b, int c) {return a * b * c;}
    static double volume (double r) {return (4.0/3.0) * Math.PI * Math.pow(r, 3);}

}

public class method_overloading_polymorphism_concelpt {
    public static void main(String[] args) {
        System.out.println("Volume of a cube with side 5 : " + volume_finder.volume(5, 5));
        System.out.println("Volume of a cuboid with sides 5, 6, 7 : " + volume_finder.volume(5, 6, 7));
        System.out.println("Volume of a sphere with radius 5 : " + volume_finder.volume(5.0));
    }    
}
