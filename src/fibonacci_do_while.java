//java program to print fibonacci series using do while loop
// Sat June 01 2024



import java.util.Scanner;
public class fibonacci_do_while {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)){
        System.out.print("Enter the number of terms : ");
        int num = object.nextInt();

        int a = 0;
        int b = 1;
        int sum;
        int i = 0;

        do { 
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
            i++;
            
        } 
            while (i < num);
        object.close();
        }
    }  
}
