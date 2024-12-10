//java program to print a left number triangle pattern using while loop
//practice session


import java.util.Scanner;

public class pattern_left_number_triangle_while_loop {
        public static void main(String[] args) {
            try (Scanner object = new Scanner(System.in)) {
                System.out.print("Enter the number of rows : ");
                int num = object.nextInt();
                int i = 1;             
                while (i <= num) {
                    int j = num;
                    while (j > i) {
                        System.out.print("  ");
                        j--;
                    }
                    int k = 1;
                    while (k <= i) {
                        System.out.print(k + " ");
                        k++;
                    }
                    System.out.println();
                    i++;
                }

            } catch (Exception e) {
                System.err.println("error -> program crahsed");
            }
        }
    }
