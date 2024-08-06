//java program to print right number triangle pattern using for loop
// Sat June 01 2024

import java.util.Scanner;

public class pattern_right_number_triangle_for_loop {
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in)){
            System.out.print("Enter the no. of rows : ");
            int num = obj.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}

