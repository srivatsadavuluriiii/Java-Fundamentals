//java program to convert decimal to binary
// Sat June 01 2024

import java.util.Scanner;

public class decimal_to_binary {

    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)){
        System.out.print("Enter a number : ");
        int num = object.nextInt();

        int sum = 0;
        for (int i = 0; num > 0; i++) {
            int remainder = num % 2;
            sum = sum + remainder * (int)Math.pow(10, i);
            num = num / 2;
        }
        System.out.println("Number in Binary : " + sum);

        object.close();
    }

    }
    
}
