//java program to find the greatest common divisor of two numbers
// Sat June 01 2024


import java.util.Scanner;

public class greatest_common_divisor {
    public static void main(String[] args){
        try(Scanner object = new Scanner(System.in)){
        System.out.print("Enter first number: ");
        int num1 = object.nextInt();
        System.out.print("Enter second number: ");
        int num2 = object.nextInt();

        int least = 1;
        for (int i = 1; i <= num1; i++) {
            if (num1%i == 0 && num2%i == 0) {
                least = i;
            }
        }
        System.out.println(least);

        object.close();
        }

    }
}