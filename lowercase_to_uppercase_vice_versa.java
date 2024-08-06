//java program to replace lowercase char to uppercase and vice versa
// Sat June 01 2024
import java.util.Scanner;

public class lowercase_to_uppercase_vice_versa {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)){
        System.out.print("Enter a string : ");
        String str = object.nextLine();
        char[] ch = str.toCharArray();


        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] -= 32;
            } else{
                System.out.println("Error");
            }
        }
        System.out.println(ch);
        object.close();
    }
    }
    
}
