import java.util.Scanner;

class factorialFinder {
    void factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) { f *= i; }
        System.out.print(f);
    }
}


public class factorial_program_using_methods {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);){
            System.out.print("Enter number : ");
            int num = object.nextInt();

            factorialFinder factorialNum = new factorialFinder();
            factorialNum.factorial(num);

        } 
        catch (Exception e) {System.err.print("error -> program crashed");}
    }
}


