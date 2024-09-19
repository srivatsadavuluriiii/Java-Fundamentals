import java.util.*;
public class smallest_prime_factor_spf_query_optimized {
    static void spfQueryApproach(List<List<Integer>> queries) {
        int c = 100000; //constraints : 10^5
        int[] spf = new int[c + 1];
        for (int i = 1; i < c; i++) {
            spf[i] = i;
        }



        for (int i = 2; i * i < 100000; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < 100000; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        int q = queries.size();
        for (int i = 0; i < q; i++) {
            int num = queries.get(i).get(0);
            while (num != 1) {
                System.out.print(spf[num] + ", ");
                num /= spf[num];
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.print("Enter Number of Queries : ");
            int queryCount = object.nextInt();
            List<List<Integer>> queries = new ArrayList<>();
            for (int i = 0; i < queryCount; i++) {
                List<Integer> list = new ArrayList<>();
                System.out.print("Enter Number : ");
                list.add(object.nextInt());
                queries.add(list);
            }
            spfQueryApproach(queries);
            System.out.println(Integer.MAX_VALUE);

        } catch(Exception e) { System.err.println(e); }
    }
}
