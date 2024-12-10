package pracForFat;

import java.util.Scanner;

class ChineseRemainderTheorem {
    static int calc(int k, int mod[], int rem[]) {
        int x = 1;
        while (true) {
            int j;
            for (j = 0; j < k; j++) {
                if (x % mod[j] != rem[j]) {
                    break;
                }
            }
            if (j == k) {
                return x;
                }
            x++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mod = new int[size];
        int[] rem = new int[size];

        for (int b = 0; b < size; b++) {
            rem[b] = sc.nextInt();
        }
        
        for (int a = 0; a < size; a++) {
            mod[a] = sc.nextInt();
        }
        

        System.out.println(calc(size, mod, rem));
    }

}