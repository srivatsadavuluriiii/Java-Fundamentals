//java program to check if a number is an automorphic number
// Sat June 01 2024

import java.util.Scanner;

public class automorphic_number_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in);){
            System.out.print("Enter number to check automorphicity : ");
            int n = object.nextInt();

            int num = (int) Math.pow(n, 2);
            int lastTwoDigits = 0;
            int rem;

            for (int i = 0; i < 2; i++) {
                rem = num % 10;
                lastTwoDigits = lastTwoDigits * 10 + rem;
                num = num / 10;
            }

            int result = (lastTwoDigits % 10) * 10 + (lastTwoDigits / 10);

            if (result == n) { System.out.print("Automorphic");} 
            else {System.out.print("Not Automorphic");}
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}

