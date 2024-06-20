//java program to print a left number triangle pattern using for loops
//practice session

import java.util.Scanner;

public class pattern_left_number_triangle_for_loop {

    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter the number of rows : ");
            int num = object.nextInt();

            for (int i = 0; i < num; i++) {
                for (int j = 2 * (num - i - 1) - 1; j >= 0; j--) { System.out.print(" ");} //for spaces
                for (int j = 0; j <= i; j++) { System.out.print(j + " "); }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("error -> program crahsed");
        }
    }
}



