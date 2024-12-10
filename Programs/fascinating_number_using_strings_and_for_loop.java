import java.util.Scanner;

public class fascinating_number_using_strings_and_for_loop {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in);){
            System.out.print("Enter number to check for fascinating number : ");
            int num = object.nextInt();
            String str = Integer.toString(num) + Integer.toString(2 * num) + Integer.toString(3 * num);
            boolean flag = true;
            for (char c = '1'; c <= '9'; c++)  {
                if(str.indexOf(c) == -1) {
                    flag = false;
                    break;}}
            if (flag) { System.out.print("Number is a Fascinating Number ");} 
            else { System.out.print("Number not a Fascinating Number "); }} 
        catch (Exception e) {System.err.print(e);}
    }
}



