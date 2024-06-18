//java program to create a inverse left number triangle using for loops
//practice session


import java.util.Scanner;

public class pattern_inverse_left_number_triangle_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter number of rows : ");
            int num = object.nextInt();
            
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) { System.out.print(" "); }
                for (int j = 1; j <= num - i + 1; j++) { System.out.print("* ");}
                System.out.println();
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}        
    }
}
