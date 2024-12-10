import java.util.Scanner;

public class n_bulbs_factoring_method {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) {
            int num = object.nextInt();
            boolean[] arr = new boolean[num + 1];
            int count = 0;
            for (int i = 1; i <= num; i++) {
                for (int j = i; j <= num; j+=i) {
                    arr[j] = !arr[j];
                    }
                }
                for (int i = 1; i <= num; i++) { if (arr[i] == true){ count++; } }
                System.out.println(count);
            } catch (Exception e){
            System.err.println(e);
        }
    }
}