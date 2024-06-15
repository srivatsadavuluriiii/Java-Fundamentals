//java program to implement inheritance
// Thu June 06 2024

/*
Develop a java application with Employee class with Emp_name, Emp_id, Address,
mailid and mobile number as members. Inherit the classes, Programmer, Assistant
Professor, Associate Professor, Professor from employee class with 97% of BP as DA, 10% of BP as HRA, 12% of
BP as PF and 0.1% of BP for staff club fund. Generate pay slips for the employees with
their gross and net salary.
 */

class EmployeeInfo {

    String employeeName;
    int employeeId;
    String employeeAddress;
    String employeeMailId;
    long employeeMobileNumber;
    double basicPay;
    double da;
    double hra;
    double pf;
    double staffClubFund;

    public EmployeeInfo(
        String employeeName,
        int employeeId,
        String employeeAddress,
        String employeeMailId,
        long employeeMobileNumber,
        double basicPay
    ) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeAddress = employeeAddress;
        this.employeeMailId = employeeMailId;
        this.employeeMobileNumber = employeeMobileNumber;
        this.basicPay = basicPay;
        this.da = 0.97 * basicPay;
        this.hra = 0.10 * basicPay;
        this.pf = 0.12 * basicPay;
        this.staffClubFund = 0.001 * basicPay;
    }

    void printSalary() {
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Employee Mail ID: " + employeeMailId);
        System.out.println("Employee Mobile Number: " + employeeMobileNumber);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("");
    }
}

class Programmer extends EmployeeInfo {

    public Programmer(
        String employeeName,
        int employeeId,
        String employeeAddress,
        String employeeMailId,
        long employeeMobileNumber,
        double basicPay
    ) {
        super(
            employeeName,
            employeeId,
            employeeAddress,
            employeeMailId,
            employeeMobileNumber,
            basicPay
        );
    }
}

class AssistantProfessor extends EmployeeInfo {

    public AssistantProfessor(
        String employeeName,
        int employeeId,
        String employeeAddress,
        String employeeMailId,
        long employeeMobileNumber,
        double basicPay
    ) {
        super(
            employeeName,
            employeeId,
            employeeAddress,
            employeeMailId,
            employeeMobileNumber,
            basicPay
        );
    }
}

class AssociateProfessor extends EmployeeInfo {

    public AssociateProfessor(
        String employeeName,
        int employeeId,
        String employeeAddress,
        String employeeMailId,
        long employeeMobileNumber,
        double basicPay
    ) {
        super(
            employeeName,
            employeeId,
            employeeAddress,
            employeeMailId,
            employeeMobileNumber,
            basicPay
        );
    }
}

class Professor extends EmployeeInfo {

    public Professor(
        String employeeName,
        int employeeId,
        String employeeAddress,
        String employeeMailId,
        long employeeMobileNumber,
        double basicPay
    ) {
        super(
            employeeName,
            employeeId,
            employeeAddress,
            employeeMailId,
            employeeMobileNumber,
            basicPay
        );
    }
}

public class pay_slip_generation_using_inheritance {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(
            "Srivatsa Davuluri",
            15507,
            "CP, New Delhi, India",
            "srivatsa.davuluri@vitstudent.ac.in",
            9873342537,
            200000
        );
        programmer.printSalary();

        AssistantProfessor assistantProfessor = new AssistantProfessor(
            "Debargha Das",
            14457,
            "Pahar Ganj, New Delhi, India",
            "debarghadas.2022@dtu.com",
            9643800446,
            150000
        );
        assistantProfessor.printSalary();

        AssociateProfessor associateProfessor = new AssociateProfessor(
            "Utkrist Gupta",
            16678,
            "BSNL Colony, New Delhi, India",
            "utkristg9123@gmail.com",
            7866891234,
            170000
        );
        associateProfessor.printSalary();

        Professor professor = new Professor(
            "Parth Gupta",
            17730,
            "Pari Chowk, Greater Noida, India",
            "parthgupta.mitblr@mitblr.com",
            7897649376,
            190000
        );
        professor.printSalary();
    }
}
