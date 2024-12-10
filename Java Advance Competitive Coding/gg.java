// public class gg {
//     static boolean binaryPalindrome(int n) {
//         int rev = 0;
//         int originalNum = n;
//         while (n > 0) {
//             rev <<= 1; // Left shift rev by 1 bit
//             rev = rev | (n & 1); // Add the last bit of n to rev
//             n >>= 1; // Right shift n by 1 bit
//         }
//         return rev == originalNum;
//     }

//     public static void main(String[] args) {
//         int num = 7;
//         // Print whether the number is a binary palindrome
//         System.out.println("Is " + num + " a binary palindrome? " + binaryPalindrome(num));
//     }
// }

public class gg {
    int fun(int n) {
        if (n <= 1) {
            return n;
        }
        return fun(n - 2) + fun(n - 1); // Recursive Fibonacci calculation
    }
    public static void main(String[] args) {
        gg obj = new gg();
        int x = obj.fun(5);
        System.out.println(x);
    }
}