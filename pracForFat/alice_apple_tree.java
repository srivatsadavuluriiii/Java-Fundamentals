package pracForFat;

import java.util.Scanner;

public class alice_apple_tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();

        int sum = 0;
        int count = 0;
        while(sum < apple) {
            count++;
            sum += (12*count*count);

        }
        System.out.println(8*count);
    }
}
