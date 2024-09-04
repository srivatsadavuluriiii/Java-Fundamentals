//program to print factorials till a given number using while loop
//Practice - Session

import java.util.Scanner;

public class factorial_till_a_given_number_while_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int num = object.nextInt();
            int factorial = 1;
            int i = 1;

            while (i <= num) {
                factorial *= i;
                i++;
                System.out.print(factorial + ", ");
            }   
        } catch (Exception e) {System.err.println("error -> program crashed"); }
    }
}
