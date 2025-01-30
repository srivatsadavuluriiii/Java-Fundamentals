

public class euclidian_GCD {
    static int euclidian(int a, int b) {
        if (a == 0) {
            return b;
            }
        else{
            return euclidian(b % a, a);
        }
    }
    public static void main(String[] args) {
        System.out.println(euclidian(50, 65));
    }
}
