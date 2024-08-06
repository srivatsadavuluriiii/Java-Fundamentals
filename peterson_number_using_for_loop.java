// //145 = !1 + !4 + !5
// //for (int j = 1; j <= num; j++) { factorial *= j; }

import java.util.Scanner;

public class peterson_number_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in);){
            System.out.print("Enter number to check for Peterson's test : ");
            int num = object.nextInt();
            int originalNum = num;
            int sum = 0, rem;

            while (num > 0) {
                rem = num % 10;
                sum += factorial(rem);
                num /= 10;
            }

            if (originalNum == sum) { System.out.print("Peterson's Number"); } 
            else { System.out.print("Not a Peterson's Number"); }
        } catch (Exception e) { System.err.println("error -> program crashed");}
    }

public static int factorial(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) { factorial *= i; }
    return factorial;
}

}
