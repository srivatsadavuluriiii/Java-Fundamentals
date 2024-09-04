//java program to check whether a number is a sunny number or not
// for a number N, if N + 1 is a square , N -> sunny number

import java.util.Scanner;

public class sunny_number_using_conditional_statements {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);) {
            System.out.print("Enter number to check for a sunny number or not : ");
            int num = object.nextInt();
            
            if (Math.sqrt(num + 1) % 1 == 0) {
                System.out.print("Number is a Sunny number");
            } else {
                System.out.print("Number is a not a Sunny number");
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}
