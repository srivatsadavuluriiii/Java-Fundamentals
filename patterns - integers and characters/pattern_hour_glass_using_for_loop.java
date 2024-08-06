//java program to create a hourglass pattern using for loops
//practice session

import java.util.Scanner;

public class pattern_hour_glass_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter number of rows : ");
            int num = object.nextInt();

            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) { System.out.print(" "); }
                for (int j = 0; j < num - i; j++){ System.out.print("* "); }
                System.out.println();
            }
            for (int i = 1; i < num; i++) {
                for (int j = 0; j < num - i; j++){ System.out.print(" "); }
                for (int j = 0; j <= i; j++) { System.out.print("* "); }
                System.out.println();
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}
