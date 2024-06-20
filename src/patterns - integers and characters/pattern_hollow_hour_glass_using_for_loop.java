//java program to print an hollow hourglass pattern using for loops
//practice session

/*
Algorithm : upper : (j == 0 || i == 0 || j == num - i - 1)
            lower : (j == 0 || i == num - 1 || j == i) 
*/

import java.util.Scanner;

public class pattern_hollow_hour_glass_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in);) {
            System.out.print("Enter number of rows : ");
            int num = object.nextInt();

            for (int i = 0; i < num; i++){
                for (int j = 0; j <= i - 1; j++){System.out.print(" ");}
                for (int j = 0; j < num - i; j++){
                    if (j == 0 || i == 0 || j == num - i - 1) {System.out.print("* ");} 
                    else {System.out.print("  ");} }
                System.out.println();
            }

            for (int i = 1; i < num; i++){
                for (int j = 0; j < num - i - 1; j++){System.out.print(" ");}
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == num - 1 || j == i) {System.out.print("* ");} 
                    else {System.out.print("  ");} }
                System.out.println();
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}
