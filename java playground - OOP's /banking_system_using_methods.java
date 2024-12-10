import java.util.Scanner;

class bankingFunctions {
    int balance = 10000;

    void displayBalance() { System.out.printf("Outstanding Balance : %d", balance); System.out.println(); }

    void deposit (int depo) {
        balance += depo;
        System.out.printf("Outstanding balace after deposit : %d", balance);
        System.out.println();
    }

    void withdraw(int wthdrw) {
        if (balance < wthdrw) {
            System.out.print("Retry -> Insufficient Balance");
            System.out.println();
        } else {
            balance -= wthdrw;
            System.out.printf("Outstanding balace after withdrawal : %d", balance);
            System.out.println();
        }
    }
}



public class banking_system_using_methods {
    public static void main(String[] args) {
        int dep, wd;
        Scanner object = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit the program");
            System.out.print("Enter choice: ");
            System.out.println();

            int num = object.nextInt();

            switch (num) {
                case 1 -> {
                    bankingFunctions s1 = new bankingFunctions();
                    s1.displayBalance();
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    dep = object.nextInt();
                    bankingFunctions s1 = new bankingFunctions();
                    s1.deposit(dep);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    wd = object.nextInt();
                    bankingFunctions s1 = new bankingFunctions();
                    s1.withdraw(wd); }
                
                case 4 -> {
                    System.out.println();
                    System.out.println("Thank you for using our services.");
                    object.close();
                    return;
                }
            }
        }
    }
}


