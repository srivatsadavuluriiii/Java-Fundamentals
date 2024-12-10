import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class smallest_prime_factor_spf_query_unoptimized {
    static void spfQueryApproach(List<List<Integer>> queries) {
        int q = queries.size();
        for (int i = 0; i < q; i++) {
            int num = queries.get(i).get(0);
            List<Integer> list = getPrimeFactors(num);
            System.out.println("Smallest Prime Factor of " + num + " is: " + list.get(0));
        }
    }

    static List<Integer> getPrimeFactors (int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.println("Enter Number of Queries: ");
            int queryCount = object.nextInt();
            List<List<Integer>> queries = new ArrayList<>();
            for (int i = 0; i < queryCount; i++) {
                List<Integer> list = new ArrayList<>();
                System.out.println("Enter Number: ");
                list.add(object.nextInt());
                queries.add(list);
            }
            spfQueryApproach(queries);
        } catch(Exception e) { System.err.println(e); }
    }
}
