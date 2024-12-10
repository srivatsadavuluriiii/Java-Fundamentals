//To determine sum of harmonic series for given value of n
// Sat June 01 2024

import java.util.Scanner;
public class harmonic_series {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)){
        System.out.print("Enter the value of n : ");
        int n = object.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("1/" + i + " + ");
            sum += 1.0 / i;

        }
        System.out.println(" ");
        System.out.println("Sum of harmonic series is : " + sum);
        object.close();
        }
    }
}







