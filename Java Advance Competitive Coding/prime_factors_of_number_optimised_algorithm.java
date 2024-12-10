import java.util.*;
public class prime_factors_of_number_optimised_algorithm {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.print("Enter Number : ");
            int num = object.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) { list.add(i); 
                    while (num % i == 0) {  num /= i; } } }
            if (num != 1) { list.add(num); }
            System.out.println(list);
        } catch(Exception e) { System.err.println(e); }
    }
}
