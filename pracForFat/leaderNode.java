package pracForFat;

public class leaderNode {
    static void findingLeaders(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                }
            }

            if (isLeader) System.out.print(arr[i] + " ");
        }    
    }
    
    public static void main(String[] args) {
        int[] arr = {14,20,3,6,5};
        findingLeaders(arr);
    }

}
