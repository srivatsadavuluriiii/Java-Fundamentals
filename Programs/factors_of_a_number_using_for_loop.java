import java.util.Scanner;

public class factors_of_a_number_using_for_loop {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);){
            System.out.print("Enter number : ");
            int num = object.nextInt();

            for (int i = 1; i <= num; i++) {
                if (num % i == 0){System.out.print(i + ", ");}
                else {System.out.print("");}
            }
        } 
        catch (Exception e) {System.err.print("error -> program crashed");}
    }
}