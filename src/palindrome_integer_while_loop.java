//java program to reverse a number using while loop
// Sat June 01 2024


import java.util.Scanner;
public class palindrome_integer_while_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int num = object.nextInt();
            
            int rem;
            int temp = 0;
            int i = 0;
            
            while(i < num){
                rem = num % 10;
                temp = temp * 10 + rem;
                num = num / 10;
                i++;
            }
            
            System.out.println("Reversed Number : " + temp);
        }
    }
    
}
