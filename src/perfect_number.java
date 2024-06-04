//java program to check if a number is a perfect number
// Sat June 01 2024


import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
        System.out.print("Enter a number : ");
        int num = object.nextInt();

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                System.out.println("Factors of " + num + " are : " + i);
            }
        }

        int sum = 0;
        int product = 1;

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum = sum + i;
                product = product * i;
            }
        }

        System.out.println(sum + " : sum of factors");
        System.out.println(product + " : product of factors");
        System.out.println(sum + " <--> " + product);

        if(sum == num && product == num){
            System.out.println(num + " is a perfect number");
        }else{
            System.out.println(num + " is not a perfect number");
        }

        object.close();
        }
    }
}


/*
 6 - 1,2,3
 1+2+3, 1*2*3
 */