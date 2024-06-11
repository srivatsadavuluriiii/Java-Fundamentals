// Java program to count the number of votes for each candidate in an election and the number of spoilt ballots
// Thu June 06, 2024


import java.util.Scanner;

class Election {
    private final int[] count; 
    private int spoiltBallots; 

    public Election() {
        count = new int[5];
        spoiltBallots = 0; 
    }

    
    public void readBallots() {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter the number of ballots: ");
        int numBallots = scanner.nextInt();

        System.out.print("Enter the votes (candidate number 1-5): ");
        for (int i = 0; i < numBallots; i++) {
            int vote = scanner.nextInt();
            if (vote >= 1 && vote <= 5) {
                count[vote - 1]++; 
            } else {
                spoiltBallots++;
            }
        }
    }
    }


    public void printResults() {
        for (int i = 0; i < count.length; i++) {
            System.out.println("Candidate " + (i + 1) + " received " + count[i] + " votes.");
        }
        System.out.println("Number of spoilt ballots: " + spoiltBallots);
    }

    public static void main(String[] args) {
        Election election = new Election();
        election.readBallots();
        election.printResults();
    }
}

