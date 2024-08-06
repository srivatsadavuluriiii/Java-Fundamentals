//java program to check if a number is an armstrong number using for loop
// Sat June 01 2024

import java.util.Scanner;

public class armstrong_number_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = object.nextInt();
            int originalNum = num;
            int rem;
            int sum = 0;

            for (int i = num; i > 0; i /= 10) {
                rem = num % 10;
                sum += (int) Math.pow(rem, 3);
                num /= 10;
            }

            if (sum == originalNum) { System.out.println(originalNum + " is an Armstrong number."); } 
            else { System.out.println(originalNum + " is not an Armstrong number."); }

        } catch (Exception e) { System.err.println("Error -> Program crashed"); }
    }
}