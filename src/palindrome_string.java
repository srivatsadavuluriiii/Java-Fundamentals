//java program to check whether a string is palindrome or not
// Sat June 01 2024

// import java.util.Scanner;

// public class palindrome_string {
//     public static void main(String[] args) {
//         try (Scanner obj = new Scanner(System.in)){
//         System.out.println("Enter a string : ");
//         String str = obj.next();
//         obj.close();

//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }
//         if (str.equals(rev)) {
//             System.out.println("palindrome");
//         } else {
//             System.out.println("not a palindrome");
//         }

//         }
//     }

// }


public class palindrome_string {
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindromeWhile(str));
        System.out.println(isPalindromeFor(str));


    }

    static boolean isPalindromeFor(String str) {
        //edge cases 
        if (str == null || str.length() == 0){ return true; }

        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - i - 1);
            if (start != end) {
                return false; } }
        return true;
    }

    static boolean isPalindromeWhile(String str) {
        // edge cases
        if (str == null || str.length() == 0){ return true; }
        str = str.toLowerCase(); 
        int start = str.charAt(0);
        int end = str.charAt(str.length() - 1);
        while(start < end) {
            if (start != end) {
                return false; } }
        return true;
    }
}