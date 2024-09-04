
import java.util.Scanner;

public class tech_number_using_integer_methods_till_a_number{
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);){
            System.out.print("Enter upper limit : ");
            int num = object.nextInt();
            for (int i = 0; i <= num; i++){
                int len = 0;
                int orignalNum = i;

                if (len % 2 != 0){ continue; }

                while (orignalNum > 0) {
                    len++;
                    orignalNum /= 10;
                }

                orignalNum = i;
        
            int power = (int) Math.pow(10, (len / 2));
            int firstHalf = orignalNum / power;
            int secondHalf = orignalNum % power;
            int sum = firstHalf + secondHalf;

            if (i == (int) Math.pow(sum, 2)){ System.out.print(i + ", "); }}
        } catch (Exception e) {System.err.print("error -> program crashed");}
    }
}