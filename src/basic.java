import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        //add
        int c = a + b;
        System.out.printf("value of a + b = %d\n", c);
        //sub
        int d = a - b;
        System.out.printf("value of a - b = %d\n", d);
        //mul
        int e = a * b;
        System.out.printf("value of a * b = %d\n", e);
        //swap
        System.out.printf("value of a = %d\n", a);
        System.out.printf("value of b = %d\n", b);
        int temp;
        //shallow copy
        temp = a;
        a = b;
        b = temp;
        System.out.printf("value of a after swap = %d\n", a);
        System.out.printf("value of b after swap = %d\n", b);

        //even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        sc.close();


        //palindrome
        Scanner palindrome = new Scanner(System.in);
        System.out.println("Enter palindrome number : ");
        int number = palindrome.nextInt();
        int rem,sum=0;
        int temp1;

        temp1 = number;
        //eg - 454 -> 400 + 50 + 4
        while(number > 0){
            rem = number % 10;  //getting remainder
            sum = (sum * 10) + rem;
            number = number / 10;
        }
        if(temp1 == sum)
            System.out.println("Number is a palindrome");
        else {
            System.out.println("Number is not a palindrome");
        }

        palindrome.close();
        // find the greatest coomon divisor of two numbers
    }

}
