import java.util.*;
public class factors_approach_2 {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.print("Enter number : ");
            int num = object.nextInt();

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + ", ");
                    if (num/i != i) {
                        System.out.print(num/i + ", ");
                    }
                }
            }
        } catch(Exception e) { System.err.println(e); }
    }
}
