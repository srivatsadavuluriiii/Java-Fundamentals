import java.util.Scanner;

class primeChecker {
    public boolean prime(int num) {
        if (num <= 1) {
            System.out.print("Number cannot be Prime");
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;} } }
        return true;
    }
}

class reversal {
    public int reversed(int num) {
        int rem, sum = 0;
        do { 
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        } while (num != 0);

        return sum;
    }
}

public class emirp_number_using_for_loop {
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in);){
            System.out.print("Enter number to check if emirp if not : ");
            int num = obj.nextInt();

            primeChecker number = new primeChecker();
            boolean isPrimeNumber = number.prime(num);

            reversal reversed_number = new reversal();
            int rev = reversed_number.reversed(num);
            boolean isReversedNumber = number.prime(rev);

            if (isPrimeNumber && isReversedNumber) { System.out.print(num + " is an emirp number.");} 
            else { System.out.print(num + " is not an emirp number."); }
        } 
         catch (Exception e) {System.err.print(e);}
    }    
}