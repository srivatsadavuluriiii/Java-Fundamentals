package pracForFat;

public class max_product_subarray {
    static int maxProduct(int[] a) {
        int max = a[0];
        int min = a[0];
        int m = a[0];
        int temp;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > 0){
                max = Math.max(a[i], max*a[i]);
                min = Math.min(a[i], min*a[i]); }

            else if (a[i] == 0) {
                max = min = 0;
            }
            else{
                temp = max;
                max = Math.max(a[i], min*a[i]);
                min = Math.min(a[i], temp*a[i]);
            }

            m = Math.max(m, max);

        }
        return m;
    }

    public static void main(String[] args) {
        int[] arr = {4,0,-2,6};
        System.out.println(maxProduct(arr));
    }
}
