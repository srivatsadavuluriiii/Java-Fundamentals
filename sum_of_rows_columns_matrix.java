//program to obtain the sum of rows and columns of a matrix
// Sat June 01 2024
import java.util.Scanner;


public class sum_of_rows_columns_matrix {
    public static void main(String[] args) {

        try (Scanner mat = new Scanner(System.in)){
        System.out.print("Enter the number of rows for matrix : ");
        int row = mat.nextInt();
        System.out.print("Enter the number of columns for matrix : ");
        int col = mat.nextInt(); 

        int[][] matrix = new int[row][col];
        for (int a = 0; a < row; a++) {
            for (int b = 0; b < col; b++) {
                matrix[a][b] = mat.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }


        // MAIN CODE



        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum = rowSum + matrix[i][j];
                
            }
            System.out.println("Sum of row " + (i + 1) + " is " + rowSum);
        }
        for (int i = 0; i < matrix.length; i++) {
            int colSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                colSum = colSum + matrix[j][i];
                
            }
            System.out.println("Sum of column " + (i + 1) + " is " + colSum);
        }

        mat.close();

    }

    }
    
}
