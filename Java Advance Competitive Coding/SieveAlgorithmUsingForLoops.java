/*Boolean array -> false
 * square root
 * All multiples are true
 * False -> prime number
 * 
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SieveAlgorithmUsingForLoops {

    //Approach 1
    public static void SieveAlgorithmApproach1(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
    }

    //Approach 2
    public static void SieveAlgorithmApproach2(int n) {
        try (Scanner object = new Scanner(System.in)) {
            int num = object.nextInt();
            boolean[] arr = new boolean[num + 1];
            for (int i = 2; Math.pow(i, 2) <= num; i++) {
                for (int j = 2 * i; j <= num; j+=i) {
                    arr[j] = true;
                }
            }

            for (int i = 2; i <= num; i++) {
                if (arr[i] == false) {
                    System.out.print(i + ", ");
                }
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

        public static void SieveAlgorithmApproach3(int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                primes.add(i);
            }
            for (int j = 0; j < primes.size() && i * primes.get(j) <= n; j++) {
                isPrime[i * primes.get(j)] = true;
                if (i % primes.get(j) == 0) break;
            }
        }
        
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; 
        // SieveAlgorithmApproach1(n);
        // SieveAlgorithmApproach2(n);
        SieveAlgorithmApproach3(n);
    }
}


