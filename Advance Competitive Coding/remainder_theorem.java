import java.util.Scanner;
public class remainder_theorem {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int[] divArray = new int[num];
            for (int i = 0; i < num; i++) {
                divArray[i] = sc.nextInt();
            }
            int[] remArray = new int[num];
            for (int i = 0; i < num; i++) {
                remArray[i] = sc.nextInt();
            }
            int i;
            int x = 1;

            while(true) {
                for (i = 0; i < num; i++) {
                    if (x % divArray[i] != remArray[i]) {
                        break;
                    }
                }
                if (i == num) {
                    System.out.println(x);
                    return;
                }
                x++;
            }

        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
