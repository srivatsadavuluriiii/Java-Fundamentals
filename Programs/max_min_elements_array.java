import java.util.Arrays;

public class max_min_elements_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Array : " + Arrays.toString(arr));

        System.out.println("Max element = " + max(arr));
        System.out.println(maxRange(arr, 0, 3));
        System.out.println("Min element = " + min(arr));
        System.out.println(minRange(arr, 3, 5));

    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i]; } }
        return maxValue;
    }

    static int maxRange(int[] arr, int start, int end) {
        // edge cases
        if (end > start || arr == null) {
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];} }
        return maxValue;
    }


    static int min(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i]; } }
        return minValue;
    }

    static int minRange(int[] arr, int start, int end) {
        // edge cases
        if (end > start || arr == null) {
            return -1;
        }
        int minValue = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i]; } }
        return minValue;
    }
}
  