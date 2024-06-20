//java program to print right triangle pattern using for loop
// Sat June 01 2024

import java.util.Scanner;

public class pattern_right_triangle_for_loop {
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in)){
            System.out.print("Enter the no. of rows : ");
            int num = obj.nextInt();

            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) { System.out.print("* "); }
                System.out.println();
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}

