
import java.util.Scanner;

public class palindrome_integer_do_while_loop {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = object.nextInt();
            
            int rem;
            int sum = 0;

            do { 
                rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;
            } while (num != 0); System.out.println("Reverse of the number is : " + sum);
        } catch (Exception e) { System.err.println("error -> program crash");}
    }
}
