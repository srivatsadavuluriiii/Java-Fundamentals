package pracForFat;

public class incSieve {
    public static void incrementalSieve(int l, int h) {
        boolean[] prime = new boolean[h + 1];
        for (int i = 2; i * i <= h; i++) {
            int sm = (l/i) * i;
            if (sm < 1) {
                sm += i;
            }
            for (int j = sm; j <= h; j += i) {
                prime[j] = true;
            }
        }

        for (int p = l; p <= h; p++) {
            if (prime[p] == false) {
                System.out.print(p + " ");
            }
        }

    } 

    public static void main(String[] args) {
        incrementalSieve(20, 40);
    }
    
}
