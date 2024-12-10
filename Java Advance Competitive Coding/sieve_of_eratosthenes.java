import java.util.*;
public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.print("Enter Number : ");
            int num = object.nextInt();
            boolean[] prime = new boolean[num + 1];
            for (int i = 2; i < num; i++) { prime[i] = true; }
            for (int i = 2; i * i < num; i++) {
                if (prime[i] == true) { for (int j = i * i; j <= num; j += i) { prime[j] = false; } } }
            for (int i = 2; i < num; i++) { if (prime[i] == true){ System.out.print(i + ", "); } }
        } catch(Exception e) { System.err.println(e); }        
    }
}
