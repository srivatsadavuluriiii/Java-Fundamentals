// Java program to calculate the electricity bill for a customer using constructors and a case statement
// Sat June 08, 2024


import java.util.Scanner;

class Customer {
    int customerNo;
    String customerName;
    int previousMonthReading;
    int currentMonthReading;
    String ebConnectionType;

    public Customer(int customerNo, String customerName, int previousMonthReading, int currentMonthReading, String ebConnectionType) {
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.ebConnectionType = ebConnectionType;
    }

    public int calculateUnitsConsumed() {
        return currentMonthReading - previousMonthReading;
    }

    public double calculateBillAmount() {
        int units = calculateUnitsConsumed();
        double billAmount = 0;

        if (ebConnectionType.equalsIgnoreCase("domestic")) {
            if (units <= 100) {
                billAmount = units * 1;
            } else if (units <= 200) {
                billAmount = 100 * 1 + (units - 100) * 2.5;
            } else if (units <= 500) {
                billAmount = 100 * 1 + 100 * 2.5 + (units - 200) * 4;
            } else {
                billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (units - 500) * 6;
            }
        } else if (ebConnectionType.equalsIgnoreCase("commercial")) {
            if (units <= 100) {
                billAmount = units * 2;
            } else if (units <= 200) {
                billAmount = 100 * 2 + (units - 100) * 4.5;
            } else if (units <= 500) {
                billAmount = 100 * 2 + 100 * 4.5 + (units - 200) * 6;
            } else {
                billAmount = 100 * 2 + 100 * 4.5 + 300 * 6 + (units - 500) * 7;
            }
        }

        return billAmount;
    }

    public void printBill() {
        System.out.println("Customer No: " + customerNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Previous Month Reading: " + previousMonthReading);
        System.out.println("Current Month Reading: " + currentMonthReading);
        System.out.println("EB Connection Type: " + ebConnectionType);
        System.out.println("Units Consumed: " + calculateUnitsConsumed());
        System.out.println("Bill Amount: Rs. " + calculateBillAmount());
    }
}

public class tariff_bill_using_constructors_and_case_statement {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter customer number: ");
        int customerNo = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter previous month reading: ");
        int previousMonthReading = scanner.nextInt();

        System.out.print("Enter current month reading: ");
        int currentMonthReading = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter type of EB connection (domestic/commercial): ");
        String ebConnectionType = scanner.nextLine();

        Customer customer = new Customer(customerNo, customerName, previousMonthReading, currentMonthReading, ebConnectionType);
        customer.printBill();

        scanner.close();
        }
    }
}


