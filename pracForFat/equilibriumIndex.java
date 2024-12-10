package pracForFat;

public class equilibriumIndex {
    static int findingequilibrium(int[] arr) {
        int rightSum = 0;
        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum && leftSum > maxSum) {
                maxSum = leftSum;
            }
            leftSum += arr[i];
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,2};
        System.out.println(findingequilibrium(arr));
    }
}

