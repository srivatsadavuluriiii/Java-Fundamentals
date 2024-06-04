//java program to check if a number is an armstrong number
// Sat June 01 2024

import java.util.Scanner;


public class armstrong_number_checker {
    public static void main(String[] args) {
        try(Scanner num = new Scanner(System.in)){
        System.out.println("Enter a number: ");
        int n = num.nextInt();
        int sum = 0, temp,rem;
        temp = n;

        while (n > 0) {
            rem = n % 10;  //getting remainder
            //sum = sum  + rem*rem*rem;
            sum += (int) Math.pow(rem,3);
            n /= 10;
            System.out.println("rem = " + rem);
            System.out.println("sum = " + sum);
            System.out.println("n = " + n);

        }
        if(temp == sum)
            System.out.println("Number is a armstrong number");
        else {
            System.out.println("Number is not a armstrong number");
        }

        num.close();
    }

    }
}
