import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = object.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = object.nextInt();
        }
        insertionSort(arr);
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        object.close();
    }

    public static void insertionSort(int[] arr) {
        int num = arr.length;
        for (int i = 1; i < num; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
