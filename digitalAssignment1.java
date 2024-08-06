// create a bank system which would return a interset rate info using abstract classes : 

// abstract class Bank {
//     abstract int getInterestRate();
// }


// class SBI extends Bank {
//     @Override
//     int getInterestRate(){
//         return 7;
//     }

// }

// class PNB extends Bank {
//     @Override
//     int getInterestRate(){
//         return 8;
//     }

// }

// public class abstractClass {
//     public static void main(String[] args) {
//         Bank b1 = new SBI();
//         System.out.print(b1.getInterestRate());
//         System.out.println();
//         Bank b2 = new PNB();
//         System.out.print(b2.getInterestRate());
        
//     }
// }


// abstract class Shape {
//     abstract void draw();
// }

// class Circle extends Shape {
//     @Override
//     void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Rectangle extends Shape {
//     @Override
//     void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }


// public class abstractClass {
//     public static void main(String[] args) {
//         Shape circle = new Circle();
//         circle.draw();
//         Shape rectangle = new Rectangle();
//         rectangle.draw();
        
        
//     }
// }

// class A {
//     void a() {
//         System.out.println("a");
//     }
// }

// class B extends A {
//     void b(){
//         System.out.println("b");
//     }
// }

// class C extends B {
//     void c(){
//         System.out.println("c");
//     }
// }
// public class inheritancePractice {
//     public static void main(String[] args) {
//         C object = new C();
//         object.a();
//         object.b();
//         object.c();
//     }
// }

//overriding


// class A {
//     void a() {
//         System.out.print("a");
//     }
// }

// class B extends A {
//     @Override
//     void a() {
//         System.out.print("b");
//     }
// }


// public class TestRun {
//     public static void main(String[] args) {
//         B object = new B();
//         object.a();
//     }
// }



public class digitalAssignment1 {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(reverseInt(num));
        System.out.println(fibonnaci(num));
        System.out.println(sumInInterval());
        System.out.println(sumOfHarmonicSeries(3));


    }

    static double sumOfHarmonicSeries (int n) {
        double sum = 0.0;
        for (int i = 1 ; i <= n; i++) {
            sum += (1.0) / (i);
        }
        return sum;
        
    }
    static int sumInInterval() {
        int sum = 0;
        for (int i = 100; i < 200; i++) {
            if (i % 7 == 0) { 
                sum += i;
            }
        }
        return sum;
    }
    
    static int reverseInt (int n) {
        int rem, sum = 0;

        while(n != 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum * 10 + rem;
        }

        return sum;
    }

    static int fibonnaci(int n) {
        int a = 0, b = 1, sum, i = 1;
        do { 
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
            i++;
        } while (i < n);

        return sum;
    }
}
