//java program to print a right number triangle pattern using while loop
// Sat June 01 2024

import java.util.Scanner;

public class pattern_right_number_triangle_while_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter the number of rows : ");
            int num = object.nextInt();

            int i = 1;
            while (i <= num) {
                int j = 1;
                while (j <= i) {
                    System.out.print(j + " ");
                    j++;
                }
                System.out.println(" ");
                i++;
            }
        } catch (Exception e) { System.err.println("error -> program crashed");}
    }    
}
