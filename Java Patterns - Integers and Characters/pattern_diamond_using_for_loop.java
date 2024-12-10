//java program to create a diamond pattern using for loops
//practice session

import java.util.Scanner;

public class pattern_diamond_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter number of rows : ");
            int row = object.nextInt();
            
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row - i - 1; j++) { System.out.print(" "); }
                for (int j = 0; j <= i; j++){ System.out.print("* "); }
                System.out.println();
            }

            for (int i = 0; i < row - 1; i++){ 
                for (int j = 0; j <= i; j++){ System.out.print(" "); }
                for (int j = 0; j < row - i - 1; j++) { System.out.print("* "); }
                System.out.println();
            }

        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}
