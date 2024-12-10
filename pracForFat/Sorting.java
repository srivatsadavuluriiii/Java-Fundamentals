package pracForFat;

public class Sorting {
    static void sorting(int[] arr) {
        int temp;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j+1] = temp;
                    arr[j] = arr[j+1];
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,6,8,5,3,2,1};
        sorting(arr);
    }
    
}
