public class digitalAssignment2 {
    public static void main(String[] args) {
        int num = 5;
        pattern1(num);
        pattern2(num);
        pattern3(num);
        pattern4(num);
        pattern5(num);
        pattern6(num);
        pattern7(num);
        pattern8(num);
        pattern9(num);
;    }

    static void pattern1 (int n) {
        //rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { System.out.print(" "); } 
            for (int j = 0; j <= i; j++) { System.out.print("* "); }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2 (int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { System.out.print(" "); } 
            for (int j = 0; j <= n - i - 1; j++) { System.out.print("* "); }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { System.out.print(" "); }
            for (int j = 0; j <= i; j++) { System.out.print("* "); }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { System.out.print(" "); }
            for (int j = 0; j < n - i - 1; j++) { System.out.print("* "); }
            System.out.println();
        }
    }

    static void pattern4 (int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { System.out.print(" "); }
            for (int j = 0; j <= n - i - 1; j++) { System.out.print("* "); }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { System.out.print(" "); }
            for (int j = 0; j <= i; j++) { System.out.print("* "); }
            System.out.println();
        }
    }

    static void pattern5 (int n) {
        //rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { System.out.print("* "); }
            System.out.println();
        }
    }

    static void pattern6 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) { System.out.print("* "); }
            System.out.println();
        }
    }

    static void pattern7 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { System.out.print("  "); }
            for (int j = 0; j <= i; j++) { System.out.print("* "); }
            System.out.println();
        }
    }

    static void pattern8 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { System.out.print("  "); }
            for (int j = 0; j <= n - i - 1; j++) { System.out.print("* "); }
            System.out.println();
        }
    }

    static void pattern9 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    
}
