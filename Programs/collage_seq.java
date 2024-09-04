// for even -> n/2 to -
//  for odd -> 3n+1

import java.util.Scanner;
public class collage_seq {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                for (int i = num; i < 1; i--) {
                    System.out.print( i/2 + ", ");
                }
            } else {
                for (int i = num; i < 1; i--) {
                    System.out.print(3 * i - 1 + ", ");
                    
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
