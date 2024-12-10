package pracForFat;

public class majorityElement {
    static int findingMajElement(int[] arr) {
        int majCount = 0;
        int majElement = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > majCount){
                majCount = count;
                majElement = arr[i];
            }
        }

        return majElement ;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,2,4,2,1,3,2,4,3,4,5,43,4,4,4,4,4,4};
        System.out.println(findingMajElement(arr));
    }
}
