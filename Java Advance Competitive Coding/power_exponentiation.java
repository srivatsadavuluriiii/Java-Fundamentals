import java.util.*;

public class power_exponentiation {
    public static void exponentialApproch(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans *= x;
                n -= 1;
            } else {
                n /= 2;
                x *= x;
            }
        }
        System.out.println("Exponential value : " + ans);
    }

    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.println("Enter Number : ");
            int x = object.nextInt();
            int n = object.nextInt();
            exponentialApproch(x, n);
            
         } catch(Exception e) { System.err.println(e); }
    }
}
