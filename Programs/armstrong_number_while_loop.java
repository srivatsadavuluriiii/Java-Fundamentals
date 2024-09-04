//java program to check if a number is an armstrong number using while loop
// Sat June 01 2024

import java.util.Scanner;

public class armstrong_number_while_loop {
    public static void main(String[] args) {
        try(Scanner num = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n = num.nextInt();
            int sum = 0, temp,rem;
            temp = n;

            while (n > 0) {
                rem = n % 10;
                sum += (int) Math.pow(rem,3);
                n /= 10;
            }

            if(temp == sum)
                System.out.println("Number is a armstrong number");
            else {
                System.out.println("Number is not a armstrong number");
            }
        }
    }
}
