package pracForFat;

public class manuvering_a_cave {
    static int manuvering(int m, int n) {
       if (m == 1 || n == 1) { return 1; } 
       else { return manuvering(m - 1, n) + manuvering(m, n - 1); }

    }

    public static void main(String[] args) {
        System.out.println(manuvering(3, 3));
    }
}
