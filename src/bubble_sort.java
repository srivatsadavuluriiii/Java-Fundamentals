//java program to sort an array using bubble sort
// Sat June 01 2024


public class bubble_sort {
    public static void main(String[] args) {
        System.out.println("Bubble sort");
        int[] arr = {1,2,3,8,7,5,6,4};
        int temp;
        System.out.println("Unsorted Array");
        System.out.print("{");
        for (int p : arr) { System.out.print(p + ", ");}System.out.println("}");

        for(int i = arr.length - 1  ; i > 0  ; i--){
            for(int j = 0 ; j < i ; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("Sorted Array");
        System.out.print("{");
        for (int p : arr) { System.out.print(p + ", ");}System.out.println("}");




    }
    
}


