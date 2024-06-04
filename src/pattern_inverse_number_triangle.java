import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the String : ");
        int num = object.nextInt();
        

        for (int i = 0; i <= num; i++){
            for (int j = 1; j<= num - i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

    }
}


