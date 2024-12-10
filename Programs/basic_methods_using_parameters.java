//java program to add two numbers using methods and parameters
// Tue June 04 2024

import java.util.Scanner;

class adder {
    void add(int a, int b) {
        int c = a + b;
        System.out.print("sum of Two numbers : " + c);
    }
}

public class basic_methods_using_parameters {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
        System.out.print("Enter number 1 : ");
        int num1 = object.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = object.nextInt();

        adder a = new adder();
        a.add(num1, num2);
        }
    }
}
