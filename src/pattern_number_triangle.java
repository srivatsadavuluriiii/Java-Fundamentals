//java program to print number triangle pattern
// Sat June 01 2024

import java.util.Scanner;

public class pattern_number_triangle {
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
