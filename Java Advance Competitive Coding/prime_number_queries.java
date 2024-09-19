import java.util.*;
public class prime_number_queries {

    static void queryApproach(List<List<Integer>> queries) {
        int c = 1000000;
        List<Integer> prime = getSieve(c);
        int count = 0;
        for (int i = 2; i <= c; i++) {
            count += prime.get(i);
            prime.set(i, count);
        }


        int q = queries.size();  
        for (int i = 0; i < q; i++) {
            int l = queries.get(i).get(0);
            int r = queries.get(i).get(1); 
            int result = prime.get(r) - prime.get(l-1);
            System.out.println("Number of Primes in range - [" + l + ", " + r + "]" + "= " + result);
        }
    }

    static List<Integer> getSieve (int n) {
        boolean[] prime = new boolean[n+1];
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }
        // Arrays.fill(prime, true);
        prime[0] = false; 
        prime[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (prime[i] ==  true) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(0);
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]){
                list.set(i, 1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) { 
            System.out.print("Enter Number of Queries: ");
            int queryCount = object.nextInt();
            
            List<List<Integer>> queries = new ArrayList<>();
            for (int i = 0; i < queryCount; i++) {
                List<Integer> list = new ArrayList<>();
                System.out.print("Enter L: ");
                list.add(object.nextInt());
                System.out.print("Enter R: ");
                list.add(object.nextInt());
                queries.add(list);
            }

            queryApproach(queries);
        } catch (Exception e) { 
            System.err.println(e); 
        }
    }

}
