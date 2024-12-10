//program to print factorial of a given number using while loops
//Practice - Session

import java.util.Scanner;

public class factorial_for_a_given_number_while_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int num = object.nextInt();
            int factorial = 1;
            int i = 1;

            while (i <= num) {
                factorial *= i;
                i++;
            }   
            System.out.printf("Factorial for the number : " + factorial);
        } catch (Exception e) {System.err.println("error -> program crashed"); }
    }
}
