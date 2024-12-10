//java program to print fibonacci series using for loop
// Sat June 01 2024

import java.util.Scanner;

public class fibonacci_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter the number of terms for fibinacci series : ");
            int num = object.nextInt();

            int a = 0;
            int b = 1;
            int sum;

            for (int i = 0; i < num; i++) {
                System.out.printf(a + ", ");
                sum = a + b;
                a = b;
                b = sum; }   
        } catch (Exception e) { System.err.println("error 1 -> program crash");}
    }
}