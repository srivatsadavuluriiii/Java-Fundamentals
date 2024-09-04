//java program to print a square pattern using for loops
// Sat June 01 2024


import java.util.Scanner;

public class pattern_square_number_pattern_using_for_loop {
        public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter number of rows : ");
            int num = object.nextInt();

            for (int i = 1; i <= num; i++){
                for (int j = 1; j <= num; j++){ System.out.print(j + " "); }
                System.out.println();
            }
        } catch (Exception e) { System.err.println("error -> program crashed");}
    }
}
