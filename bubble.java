// bubble sort java

import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = object.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = object.nextInt();
        }
        bubbleSort(arr);
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        object.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}