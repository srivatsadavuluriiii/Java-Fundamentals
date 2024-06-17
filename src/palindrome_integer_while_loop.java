//java program to reverse a number using while loop
// Sat June 01 2024

import java.util.Scanner;

public class palindrome_integer_while_loop {

    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int num = object.nextInt();
            int rem;
            int sum = 0;

            while (num != 0){
                rem = num % 10;
                sum = (sum * 10) + rem;
                num = num / 10;
            }
            System.out.println("Reverse of the number is : " + sum);
        }
    }
}
