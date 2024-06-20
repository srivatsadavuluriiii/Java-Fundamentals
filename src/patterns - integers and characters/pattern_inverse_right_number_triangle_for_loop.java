//java program to print an inverse right number triangle pattern using for loops
// Sat June 01 2024


import java.util.Scanner;
public class pattern_inverse_right_number_triangle_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
        System.out.print("Enter the number of rows : ");
        int num = object.nextInt();
        
        for (int i = 0; i <= num; i++){
            for (int j = 1; j <= num - i; j++){ System.out.print(j + " "); }
            System.out.println(" ");
        }
        object.close();
        }
    }
}


