import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = obj.next();
        obj.close();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }


        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }

}