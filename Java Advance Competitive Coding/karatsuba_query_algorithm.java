import java.util.*;
public class karatsuba_query_algorithm {
    static long karatsuba(long X, long Y) {
        if (X < 10 && Y < 10)
           return X * Y;
        int size = Math.max(get_size(X), get_size(Y));
        if(size < 10)
           return X * Y;
        size = (size/2) + (size%2);
        long multiplier = (long)Math.pow(10, size);
        long b = X/multiplier;
        long a = X - (b * multiplier);
        long d = Y / multiplier;
        long c = Y - (d * size);
        long u = karatsuba(a, c);
        long z = karatsuba(a + b, c + d);
        long v = karatsuba(b, d);
        return u + ((z - u - v) * multiplier) + (v * (long)(Math.pow(10, 2 * size)));
     }
     static int get_size(long value) {
        int count = (int) Math.log10(value) + 1;
        return count;
     }
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)) { 
            System.out.print("Enter number of queries : ");
            int queryCount = object.nextInt();
            List<List<Long>> queries = new ArrayList<>();
            for (int i = 0; i < queryCount; i++) {
                List<Long> list = new ArrayList<>();
                System.out.print("Enter Number 1 : ");
                list.add(object.nextLong());
                System.out.print("Enter Number 2 : ");
                list.add(object.nextLong());
                queries.add(list);

            }
            for(List<Long> query : queries) {
                long x = query.get(0);
                long y = query.get(1);
                System.out.print("The final product is: ");
                long product = karatsuba(x, y); 
                System.out.println(product);

            } 

        } catch(Exception e) { System.err.println(e); }
    }
}
