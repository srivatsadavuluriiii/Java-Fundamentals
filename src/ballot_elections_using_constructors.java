// An election contested by 5 candidates. The candidates are numbered from 1 to 5 and the voting is done by marking the candidate number on the ballot paper. Write a program to read the ballots and count the votes cast for each candidate using an array variable count. In case, a number read is outside the range 1 to 5, the ballot should be considered as 'Spoilt Ballot' and the program should also count the number of spoilt ballots.
// Thu June 06, 2024

import java.util.Scanner;

public class ballot_elections_using_constructors {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.println("Number is ballots are 5.");
            int num = 5;
            int[] count = new int[6];
            for (int i = 0; i < num; i++) {
                System.out.print("Enter the ballot you will be voting for : ");
                int ballot = object.nextInt();
                if (ballot >= 1 && ballot <= 5) {
                    count[ballot]++;
                } else {
                    count[0]++;
                }
            }
            System.out.println();
            System.out.println("Results are as follows :");
            System.out.println();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Votes for candidate " + i + " : " + count[i]);
            }
            System.out.println();
            System.out.println("Spoilt Ballots : " + count[0]);
            object.close();
        }
    }
}