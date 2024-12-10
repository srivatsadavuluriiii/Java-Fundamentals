package pracForFat;

public class max_sum_hourglass {
    static int maxHGsum(int[][] mat, int R, int C){
        int sum_max = 0;
        int sum;

        if (R < 3 || C < 3) {
            System.out.println("Not possible");
            System.exit(0);
        }

        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                sum = mat[i][j] + mat[i][j+1] + mat[i][j+2] + mat[i+1][j+1] + mat[i+2][j]+ mat[i+2][j+1] + mat[i+2][j+2];
                sum_max = Math.max(sum_max, sum);
            }
        }

        return sum_max;
    } 

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int R = 3;
        int C = 3;
        System.out.println(maxHGsum(mat, R, C));
    }
}
