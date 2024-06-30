//java program to reverse a number using for loop
// Sat June 01 2024

import java.util.Scanner;

public class palindrome_integer_for_loop {

    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int num = object.nextInt();
            int rem, sum = 0;

            int length = (int) Math.log10(num) + 1;
            
            System.out.println(length);
            for (int i = 0; i < length; i++) {
                rem = num % 10;
                num = num / 10;
                sum = sum * 10 + rem;
            }
            System.out.println(sum);
        }
    }
}
