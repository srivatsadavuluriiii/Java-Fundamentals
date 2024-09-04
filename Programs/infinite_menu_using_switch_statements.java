import java.util.Scanner;

public class infinite_menu_using_switch_statements {
    public static void main(String[] args) {
        int balance = 1000, deposit, withdraw;
        Scanner object = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit the program");
            System.out.print("Enter choice: ");

            int num = object.nextInt();

            switch (num) {
                case 1 -> {
                    System.out.printf("Option Selected: %d\n", num);
                    System.out.printf("Outstanding balance: %d\n", balance);
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    deposit = object.nextInt();
                    System.out.printf("You have deposited %d rs\n", deposit);
                    balance += deposit;
                    System.out.printf("Outstanding balance: %d\n", balance);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = object.nextInt();
                    if (balance >= withdraw) {
                        System.out.printf("You have withdrawn %d rs\n", withdraw);
                        balance -= withdraw;
                        System.out.printf("Outstanding balance: %d\n", balance);
                    } else {
                        System.err.println("Insufficient Balance");
                    }
                }
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