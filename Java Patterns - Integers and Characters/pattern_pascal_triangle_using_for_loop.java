//java program to print a left triangle pattern using while loop
//practice session

// Algorithm : factorial starts from 1 -> factorial = factorial * (i - j) / (j + 1)

import java.util.Scanner;

public class pattern_pascal_triangle_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter number of rows : ");
            int num = object.nextInt();

            for (int i = 0; i < num; i++) {
                int factorial = 1;
                for (int j = 0; j < num - i - 1; j++) { System.out.print(" "); }
                for (int j = 0; j <= i; j++) { System.out.print(factorial + " "); factorial = factorial * (i - j) / (j + 1); }
                System.out.println();
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}
