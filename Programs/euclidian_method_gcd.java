import java.util.*;
public class euclidian_method_gcd {
    public static void euclidianApproach(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) { num1 %= num2; } 
            else { num2 %= num1; } }
        int gcd = (num1 == 0) ? num2 : num1;
        System.out.println("Greatest Common Divisor is : " + gcd);
    }

    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.println("Enter Two Numbers : ");
            int num1 = object.nextInt();
            int num2 = object.nextInt();
            euclidianApproach(num1, num2);
         } catch(Exception e) { System.err.println(e); }
    }
}
