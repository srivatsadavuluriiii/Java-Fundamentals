import java.util.Scanner;


public class Sorting_array {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");

        int[] arr = {1,2,3,8,7,5,6,4};
        int temp = 0;
        System.out.println("Unsorted Array");
        System.out.print("{");
        for (int p : arr) { System.out.print(p + ", ");}System.out.println("}");

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Sorted Array");
        System.out.print("{");
        for (int p : arr) { System.out.print(p + ", ");}System.out.println("}");

        System.out.println("Min element : " + arr[0] );
        System.out.println("Max element : " + arr[arr.length - 1] );


        object.close();
        



    }


}
