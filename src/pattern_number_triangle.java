import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int num = obj.nextInt();

        

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +  " "); 
            }
            System.out.println();
        }

        obj.close();
        
    }
    
}
