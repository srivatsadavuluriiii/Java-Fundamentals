// Java program to find duplicate letters in a string
// Sat June 01 2024

import java.util.Scanner;

public class duplicate_letters_in_a_String {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
        System.out.print("Enter a string : ");
        String string = object.next();
        int len = string.length();
        char[] chars = string.toCharArray();
        
        for (int p = 0; p < len; p++) {System.out.print(chars[p] + ",");}
        System.out.println();
        
        for (int i = 0; i < len; i++) {
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    System.out.println("Duplicate letter : " + chars[i] + ", count = " + count);
                    }
                }
            }
        }
    }
}    


