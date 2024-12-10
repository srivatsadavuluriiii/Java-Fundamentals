// java program to print a hollow square using for loops
// Practice Session

/*
Always use < instead of <= inside loops 
ALgorithm = (j == 0 || j == num - 1 || i == 0 || i == num - 1)
Use "* " to print - * with a space.. and too adjust that, we use 2 spaces in else condition
*/


import java.util.Scanner;

public class pattern_hollow_square_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter number of rows : ");
            int num = object.nextInt();

            for (int i = 0; i < num; i++){
                for (int j = 0; j < num; j++){ 
                    if((i == num - 1 || j == 0 || i == 0 || j == num - 1)) { System.out.print("* "); }
                    else { System.out.print("  ");} // two spaces
                }
                System.out.println();
            }
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }    
}


