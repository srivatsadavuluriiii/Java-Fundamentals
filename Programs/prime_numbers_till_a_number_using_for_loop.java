//program to print prime numbers
// Practice - Session

/*
Algorithm - loop : i starts from 2 till num 
          - take a boolean to check isPrime
          - loop : j starts from 2 till sqrt(i)
          - if i % j == 0 -> isPrime is false && break 
 */

import java.util.Scanner;

public class prime_numbers_till_a_number_using_for_loop {
        public static void main(String[] args) {
            try (Scanner object = new Scanner(System.in);) {
                System.out.print("Enter the number of terms : ");
                int num = object.nextInt();
                    
                for (int i = 2; i <= num; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                            }
                        }
                    if (isPrime) { System.out.print(i + ", "); }
                }
            } catch (Exception e) {System.err.println("error -> program crash");}
        }
}

