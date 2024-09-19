import java.util.*;
public class greatest_common_divisor_approach_2 {
    public static void gcdApproach(int num1, int num2){
        int gcd = 1;
        for (int i = Math.min(num1, num2); i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("Greatest Common Divisor is : " + gcd);
    }
     public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.println("Enter Two Numbers : ");
            int num1 = object.nextInt();
            int num2 = object.nextInt();
            gcdApproach(num1, num2);
        } catch(Exception e) { System.err.println(e); }
    }    
}
