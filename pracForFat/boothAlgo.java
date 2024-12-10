package pracForFat;

public class boothAlgo {
    static int multiply(int a, int b) {
        int m = a;
        int A = a;
        int s = -a;
        int r = b;
        int P = 0;
        int count = Integer.SIZE;
        while (count > 0) { 
            if ((r & 1) == 1) {
                P += A;
                s += m;
            }
            A<<=1;
            s<<=1;
            count--;
            r>>=1;
        }
        return P;
    }

    public static void main(String[] args) {
        System.out.println(multiply(10, 40));
    }
}
