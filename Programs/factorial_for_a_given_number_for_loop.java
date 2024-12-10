//program to print factorial of a given number suing for loops
//Practice - Session

/*
Algorithm : factorial of n = n*(n-1)*(n-2)*...*1
            starting factorial = 1
            i -> num ;  multiply factorial * i
            f = f*i
 */

import java.util.Scanner;

public class factorial_for_a_given_number_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter the number : ");
            int num = object.nextInt();
            int factorial = 1;
        
            for (int j = 1; j <= num; j++) { factorial *= j; }
            System.out.printf("Factorial of the number : %d" +factorial);
        } catch (Exception e) {System.err.println("error -> program crashed");}   
    }
}
