//java program to print a random square pattern using for loops
// Sat June 01 2024

import java.util.Scanner;

public class pattern_random_number_square_using_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter number of rows : ");
            int num = object.nextInt();

            for (int i = 1; i <= num; i++){
                for (int j = 1; j <= num; j++){ 
                    if (i == j && j == i || j == num - i + 1) {
                        System.out.print(j + " "); }
                    else {
                        System.out.print(". ");
                    }
                    }

                System.out.println();
            }

        } catch (Exception e) { System.err.println("error -> program crashed");}
    }
}
