import java.util.Scanner;
public class neon_number_using_loop {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);){
            System.out.print("Enter number to check if a number is a Keith number of not : ");
            int num = object.nextInt();
            int rem;
            int sum = 0;
            int num_sq = (int) Math.pow(num, 2);
            do {
                rem = num_sq % 10;
                sum = sum + rem;
                num_sq = num_sq / 10;
            } while (num_sq != 0);
            if (sum == num) { System.out.print("Number is a Neon Number"); } 
            else { System.out.print("Number is not a Neon Number");}
        }
        catch (Exception e) {System.err.print(e);}
    }
}
