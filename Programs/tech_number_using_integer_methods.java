//java number to check whether a number is a tech number or not
//2025 -> 20, 25 -> sum -> 45 -> 45^2 = 2025

import java.util.Scanner;

public class tech_number_using_integer_methods {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in);){
            System.out.print("Enter number to check whether the number is a tech number : ");
            int num = object.nextInt();
            int orignalNum = num;
            // to determine length of the number
            int len = 0;
            while (num > 0) {
                len++;
                num /= 10;
            }
            
            int power = (int) Math.pow(10, (len / 2));

            int firstHalf = orignalNum / power;
            int secondHalf = orignalNum % power;

            if ((int) Math.pow(firstHalf + secondHalf, 2) == orignalNum) { System.out.print("Number is a Tech Number"); }
            else {System.out.print("Number is not a Tech Number");}
        } catch (Exception e) { System.err.println("error -> program crashed"); }
    }
}
