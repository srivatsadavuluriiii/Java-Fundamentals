import java.util.Scanner;

class divisibility {
    public boolean isDivisible(int num) { return num % 7 == 0; } }

class onesDigitChecker {
    public boolean oneDigit (int num) { return num % 10 == 7; } }

public class buzz_number_using_for_loop {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);){
            System.out.print("Enter number to check for Buzz number : ");
            int num = object.nextInt();
            divisibility a = new divisibility(); boolean isDiv = a.isDivisible(num);

            onesDigitChecker b = new onesDigitChecker(); boolean onesSev = b.oneDigit(num);
            if (isDiv || onesSev) { System.out.print("Number is a Buzz Number"); } 
            else { System.out.print("Number is not a Buzz Number"); } } 
        catch (Exception e) {System.err.print(e);}
    }
}
