//program to print factorials till a given number using for loop
//Practice - Session

import java.util.Scanner;

public class factorial_till_a_given_number_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter the number : ");
            int num = object.nextInt();

            int factorial = 1;
            for (int j = 1; j <= num; j++) {
                factorial *= j; 
                System.out.print(factorial + ", ");
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}   
    }
}
