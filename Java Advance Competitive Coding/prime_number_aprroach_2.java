import java.util.*;
public class prime_number_aprroach_2 {
    public static void primeApproach(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (num/i != i) { count++; }
            }
        }
        if (count == 2) { System.out.print("Number is a Prime Number");} 
        else { System.out.print("Number is not a Prime Number"); }
    }

    public static void main(String[] args) {
    try(Scanner object = new Scanner(System.in)) { 
        System.out.print("Enter number : ");
        int num = object.nextInt();
        primeApproach(num);
     } catch(Exception e) { System.err.println(e); }
    }    
}
