package pracForFat;

public class simpleSieve {
    public static void simpleSieveProgram(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true){
                for (int j = p * p; j <= n; j += p) {
                    prime[j] = false;
                }
            }
        }

        for (int k = 2; k <= n; k++) {
            if (prime[k]) {
                System.out.print(k + " ");
            }
        }

    }

    public static void main(String[] args) {
        simpleSieveProgram(50);
    }
}


