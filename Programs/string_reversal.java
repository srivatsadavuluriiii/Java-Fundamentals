//java program to reverse a string
// Sat June 01 2024

import java.util.Scanner;

public class string_reversal {
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in)){
        System.out.print("Enter a string : ");
        String str = obj.next();
        obj.close();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String : " + rev);
        }
    }
}
