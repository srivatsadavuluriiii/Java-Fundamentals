import java.util.Scanner;

public class tech_number_using_string_methods {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in);) {
            System.out.print("Enter number to check whether the number is a Tech number : ");
            int num = object.nextInt();
            int orignalNum = num;

            String str =  Integer.toString(num);
            int len = str.length();

            if (len % 2 == 0) {
                int n = (int) len / 2;
                int firstHalf = Integer.parseInt(str.substring(0, n));
                int secondHalf = Integer.parseInt(str.substring(n));

                if ( (int) Math.pow(firstHalf + secondHalf, 2) == orignalNum){ System.out.printf("%d is a Tech Number", orignalNum); }
                else {System.out.printf("%d is not a Tech Number", orignalNum);}
            } 
            else {System.out.printf("%d cannot be check for Tech number test as the length of the number is odd", orignalNum);}
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}
