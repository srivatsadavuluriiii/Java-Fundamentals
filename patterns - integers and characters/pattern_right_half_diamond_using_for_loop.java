//java program to print a left half diamond pattern using for loops
//practice session

/*
Algorithm : upper : 
                for (int j = 0; j < num - i - 1; j++) { System.out.print(""); }
                for (int j = 0; j <= i; j++){ System.out.print("* "); }
            lower : 
                for (int j = 0; j <= i; j++){ System.out.print(""); }
                for (int j = 0; j < num - i - 1; j++) { System.out.print("* "); }
*/




import java.util.Scanner;

public class pattern_right_half_diamond_using_for_loop {


    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)){
           System.out.print("Enter number of rows : ");
           int num = object.nextInt();
           
           for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i - 1; j++) { System.out.print(""); }
                for (int j = 0; j <= i; j++){ System.out.print("* "); }
            System.out.println();
            }

           for (int i = 0; i < num - 1; i++) {
                for (int j = 0; j <= i; j++){ System.out.print(""); }
                for (int j = 0; j < num - i - 1; j++) { System.out.print("* "); }
               System.out.println();
           }

        } catch (Exception e) {System.err.println("error -> program crashed'");}
    }
}


