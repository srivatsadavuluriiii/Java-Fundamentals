package pracForFat;

public class karastsuba {
    static int karat(long x, long y){
        if (x < 10 || y < 10) {
            return (int) x *  (int) y;

        }

        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int h = (n + 1)/2;

        long a = x / (long) Math.pow(10, h);
        long b = x % (long) Math.pow(10, h);
        long c = y / (long) Math.pow(10, h);
        long d = y % (long) Math.pow(10, h);

        long ac = karat(a, c);
        long bd = karat(b, d);
        long adbc = karat(a+b, c+d) - ac - bd;

        return (int) ((ac*Math.pow(10, 2*h)) + (adbc*Math.pow(10, h)) + bd);

        

    }
    public static void main(String[] args) {
        System.out.println(karat(1000, 120));
    }
}
