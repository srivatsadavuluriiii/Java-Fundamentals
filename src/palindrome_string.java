//java program to check whether a string is palindrome or not
// Sat June 01 2024

import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)){
        System.out.println("Enter a string : ");
        String str = obj.next();
        obj.close();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        }
    }

}