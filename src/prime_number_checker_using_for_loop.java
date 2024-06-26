import java.util.Scanner;

public class prime_number_checker_using_for_loop {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);){
            System.out.print("Enter number to check whether it is prime or not : ");
            int num = object.nextInt();
            boolean flag = true;
            if (num <= 1) {
                System.out.print("Number cannot be Prime");
                flag = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        flag = false;
                        break;} } }
        
        if (flag) {System.out.print("Number is prime");}
        else {System.out.print("Number is not prime");}    
        }catch (Exception e) {System.err.print(e);}
    }
}