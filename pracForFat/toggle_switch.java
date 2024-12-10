package pracForFat;

import java.util.Scanner;

public class toggle_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 0;
        int o = 0;

        boolean[] arr = new boolean[num + 1];
        for (int i = 1; i <= num; i++) {
            for (int j = i; j * i <= num; j++) {
                arr[j] = !arr[j];
            }
        }

        for (int i = 1; i <= num; i++) {
            if (arr[i] == true) {
                c++;
            }
            else {
                o++;
            }
        }

        System.out.println(c);
        System.out.println(o);

    }
}
