//java program to print fibonacci series using while loop
// Sat June 01 2024

import java.util.Scanner;

public class fibonacci_while_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in);) {
            System.out.print("Enter the number of terms for fibinacci series : ");
            int num = object.nextInt();

            int a = 0;
            int b = 1;
            int sum;
            int i = 0;

            while (i < num) {
                System.out.print(a + ", ");           
                sum = a + b;
                a = b;
                b = sum; 
                i++; } 
        } catch (Exception e) { System.err.println("error -> code crashed");}
    }
}
