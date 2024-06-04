//java program to reverse a number using for loop
// Sat June 01 2024


import java.util.Scanner;
public class palindrome_integer_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
        System.out.print("Enter a number : ");
        int num = object.nextInt();

        int rem;
        int temp = 0;

        for (int i = 0; i < num; i++){
            rem = num % 10;
            temp = temp * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed Number : " + temp);
        object.close();
    }

        
    }
    
}
