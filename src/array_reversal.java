
public class Arrays {
    // to print the elements of an array in reverse order
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.print("{");
        for (int i = 1; i <= arr.length; i++) {

            System.out.print(arr[arr.length - i] + ", ");
        }
        System.out.print("}");
    }

}
