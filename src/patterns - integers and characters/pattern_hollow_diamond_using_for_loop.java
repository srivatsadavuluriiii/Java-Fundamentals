//java program to print a hollow diamond using for loops
// Practice - Session

/*
Always use < instead of <= inside loops 
ALgorithm = for upper part : (j == 0 || j == i)
            for lower part : (j == 0 || j == num - i - 2) -->   # {j == num - i - 2 } 
Use "* " to print - * with a space.. and too adjust that, we use 2 spaces in else condition
 */





import java.util.Scanner;

public class pattern_hollow_diamond_using_for_loop {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)){
            System.out.print("Enter number of rows :");
            int num = object.nextInt();

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i - 1; j++) { System.out.print(" "); }
                for (int j = 0; j <= i; j++) {
                    if (j == i || j == 0) { System.out.print("* "); } 
                    else { System.out.print("  "); }
                }
                System.out.println();
            }

            for (int i = 0; i < num - 1; i++) {
                for (int j = 0; j <= i; j++) { System.out.print(" "); }
                for (int j = 0; j < num - i - 1; j++) {
                    if (j == 0 || j == num - i - 2) { System.out.print("* "); } 
                    else { System.out.print("  ");}
                }
                System.out.println();
            }  
        } catch (Exception e) {System.err.println("error -> program crashed");}
    }
}
