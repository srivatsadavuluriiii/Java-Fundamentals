import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {

        Scanner mata = new Scanner(System.in);
        System.out.print("Enter the number of rows for matrix 1 : ");
        int row1 = mata.nextInt();
        System.out.print("Enter the number of columns for matrix 1 : ");
        int col1 = mata.nextInt(); 
        int[][] matrixa = new int[row1][col1];
        for (int a = 0; a < row1; a++) {
            for (int b = 0; b < col1; b++) {
                matrixa[a][b] = mata.nextInt();
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(matrixa[i][j] + "  ");
            }
            System.out.println();
        }

        Scanner matb = new Scanner(System.in);
        System.out.print("Enter the number of rows for matrix 2 : ");
        int row2 = matb.nextInt();
        System.out.print("Enter the number of columns for matrix 2 : ");
        int col2 = matb.nextInt();

        int[][] matrixb = new int[row2][col2];
        for (int c = 0; c < row2; c++) {
            for (int d = 0; d < col2; d++) {
                matrixb[c][d] = matb.nextInt();
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(matrixb[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
        // add
        if (row1 == row2 && col1 == col2) {
            System.out.println("Addition of two Matrices : ");
            int[][] c = new int[row1][col1];
            for (int s1 = 0; s1 < row1; s1++) {
                for (int s2 = 0; s2 < col1; s2++) {
                    c[s1][s2] = matrixa[s1][s2] + matrixb[s1][s2];
                    System.out.print(" " + c[s1][s2] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Order of the two Matrices are not equal ");
        }

        System.out.println();
        // sub
        if (row1 == row2 && col1 == col2) {
            System.out.println("Subtraction of two Matrices : ");
            int[][] c = new int[row1][col1];
            for (int s1 = 0; s1 < row1; s1++) {
                for (int s2 = 0; s2 < col1; s2++) {
                    c[s1][s2] = matrixa[s1][s2] - matrixb[s1][s2];
                    System.out.print(" " + c[s1][s2] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Order of the two Matrices are not equal ");
        }

        mata.close();
        matb.close();
        

    }
}







    // public static void main(String[] args){

    //     int[][] a = {{1,3,4},{2,4,3},{3,4,5}};
    //     int[][] b = {{1,3,4},{2,4,3},{1,2,4}};

    //     int[][] c = new int[3][3];

    //     for(int i=0;i<3;i++){
    //         for(int j=0;j<3;j++){
    //             c[i][j]=a[i][j]+b[i][j];
    //             System.out.print(c[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }}