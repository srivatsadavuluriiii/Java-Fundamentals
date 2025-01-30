

public class euclidPhi {


    
    static int phi(int n) {
        int r = n;
        if(n == 1) { r = 0; }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) { n /= i; }
                r -= r/i; } }
        if (n > 1) { r -= r/n; }

        return r;
    }

    public static void main(String[] args) { System.out.println(phi(1)); }
}
