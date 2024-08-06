//java program to print an inverse right number triangle pattern using while loops
//practice session

import java.util.Scanner;

public class pattern_inverse_right_number_triangle_while_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter the number of rows : ");
            int num = object.nextInt();

            int i = 0;
            while (i <= num) {
                int j = 1;
                while (j <= num - i) {
                    System.out.print(j + " ");
                    j++;
                }
                System.out.println("");
                i++;
            }
        } catch (Exception e) { System.err.println(""); }
    }
}
