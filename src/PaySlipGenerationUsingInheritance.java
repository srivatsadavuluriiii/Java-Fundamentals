//java program to implement inheritance
// Thu June 06 2024

/*
Develop a java application with Employee class with Emp_name, Emp_id, Address,
mailid and mobile number as members. Inherit the classes, Programmer, Assistant
Professor, Associate Professor, Professor from employee class with 97% of BP as DA, 10% of BP as HRA, 12% of
BP as PF and 0.1% of BP for staff club fund. Generate pay slips for the employees with
their gross and net salary.
 */


// class employee_info {
    
//     String employee_name;
//     int employee_id;
//     String employee_address;
//     String employee_mailid;
//     long employee_mobile_number;

//     public employee_info() {
//         this.employee_name = "";
//         this.employee_id = 0;
//         this.employee_address = "";
//         this.employee_mailid = "";
//         this.employee_mobile_number = 0;

//     }

//     public employee_info(String employee_name, int employee_id, String employee_address, String employee_mailid, long employee_mobile_number) {
//         this.employee_name = employee_name;
//         this.employee_id = employee_id;
//         this.employee_address = employee_address;
//         this.employee_mailid = employee_mailid;
//         this.employee_mobile_number = employee_mobile_number;

//     }
// }

// class programmer extends employee_info {
//     double basic_pay;
//     double da;
//     double hra;
//     double pf;
//     double staff_club_fund;

//     public programmer() {
//         this.basic_pay = 0;
//         this.da = 0;
//         this.hra = 0;
//         this.pf = 0;
//         this.staff_club_fund = 0;
//     }

//     public programmer(double basic_pay, String employee_name, int employee_id, String employee_address, String employee_mailid, long employee_mobile_number) {
//         this.basic_pay = basic_pay;
//         this.da = 0.97 * basic_pay;
//         this.hra = 0.10 * basic_pay;
//         this.pf = 0.12 * basic_pay;
//         this.staff_club_fund = 0.001 * basic_pay;
//     }

//     void programmer_salary() {
//         double gross_salary = basic_pay + da + hra;
//         double net_salary = gross_salary - pf - staff_club_fund;
//         System.out.println("Gross Salary : " + gross_salary);
//         System.out.println("Net Salary : " + net_salary);
//     }

// }

// class assnt_professor extends employee_info {
//     double basic_pay;
//     double da;
//     double hra;
//     double pf;
//     double staff_club_fund;

//     public assnt_professor() {
//         this.basic_pay = 0;
//         this.da = 0;
//         this.hra = 0;
//         this.pf = 0;
//         this.staff_club_fund = 0;
//     }

//     public assnt_professor(double basic_pay, String employee_name, int employee_id, String employee_address, String employee_mailid, long employee_mobile_number) {
//         this.basic_pay = basic_pay;
//         this.da = 0.97 * basic_pay;
//         this.hra = 0.10 * basic_pay;
//         this.pf = 0.12 * basic_pay;
//         this.staff_club_fund = 0.001 * basic_pay;
//     }

//     void assnt_professorr_salary() {
//         double gross_salary = basic_pay + da + hra;
//         double net_salary = gross_salary - pf - staff_club_fund;
//         System.out.println("Gross Salary : " + gross_salary);
//         System.out.println("Net Salary : " + net_salary);
//     }

// }

// class associate_professor extends employee_info {
//     double basic_pay;
//     double da;
//     double hra;
//     double pf;
//     double staff_club_fund;

//     public associate_professor() {
//         this.basic_pay = 0;
//         this.da = 0;
//         this.hra = 0;
//         this.pf = 0;
//         this.staff_club_fund = 0;
//     }

//     public associate_professor(double basic_pay, String employee_name, int employee_id, String employee_address, String employee_mailid, long employee_mobile_number) {
//         this.basic_pay = basic_pay;
//         this.da = 0.97 * basic_pay;
//         this.hra = 0.10 * basic_pay;
//         this.pf = 0.12 * basic_pay;
//         this.staff_club_fund = 0.001 * basic_pay;
//     }

//     void associate_professorr_salary() {
//         double gross_salary = basic_pay + da + hra;
//         double net_salary = gross_salary - pf - staff_club_fund;
//         System.out.println("Gross Salary : " + gross_salary);
//         System.out.println("Net Salary : " + net_salary);
//     }

// }

// class professor extends employee_info {
//     double basic_pay;
//     double da;
//     double hra;
//     double pf;
//     double staff_club_fund;

//     public professor() {
//         this.basic_pay = 0;
//         this.da = 0;
//         this.hra = 0;
//         this.pf = 0;
//         this.staff_club_fund = 0;
//     }

//     public professor(double basic_pay, String employee_name, int employee_id, String employee_address, String employee_mailid, long employee_mobile_number) {
//         this.basic_pay = basic_pay;
//         this.da = 0.97 * basic_pay;
//         this.hra = 0.10 * basic_pay;
//         this.pf = 0.12 * basic_pay;
//         this.staff_club_fund = 0.001 * basic_pay;
//     }

//     void professorr_salary() {
//         double gross_salary = basic_pay + da + hra;
//         double net_salary = gross_salary - pf - staff_club_fund;
//         System.out.println("Gross Salary : " + gross_salary);
//         System.out.println("Net Salary : " + net_salary);
//     }

// }



// public class pay_slip_generation_using_inheritance{
//     public static void main(String[] args) {

//         programmer programmer_object = new programmer(10000, "Srivatsa Davuluri Samavedam", 22, "Greater Noida, Uttar Pradesh, India", "xstcy@proton.me", 12345);
//         programmer_object.programmer_salary();

//         assnt_professor assnt_professor_object = new assnt_professor(20000, "Srivatsa Davuluri Samavedam", 22, "Greater Noida, Uttar Pradesh, India", "xstcy@proton.me", 12345);
//         assnt_professor_object.assnt_professorr_salary();

//         associate_professor associate_professor_object = new associate_professor(30000, "Srivatsa Davuluri Samavedam", 22, "Greater Noida, Uttar Pradesh, India", "xstcy@proton.me", 12345);
//         associate_professor_object.associate_professorr_salary();

//         professor professor_object = new professor(50000, "Srivatsa Davuluri Samavedam", 22, "Greater Noida, Uttar Pradesh, India", "xstcy@proton.me", 12345);
//         professor_object.professorr_salary();
        
//     }
    
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// class EmployeeInfo {
//     String employeeName;
//     int employeeId;
//     String employeeAddress;
//     String employeeMailId;
//     long employeeMobileNumber;

//     public EmployeeInfo() {
//         this.employeeName = "";
//         this.employeeId = 0;
//         this.employeeAddress = "";
//         this.employeeMailId = "";
//         this.employeeMobileNumber = 0;
//     }

//     public EmployeeInfo(String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber) {
//         this.employeeName = employeeName;
//         this.employeeId = employeeId;
//         this.employeeAddress = employeeAddress;
//         this.employeeMailId = employeeMailId;
//         this.employeeMobileNumber = employeeMobileNumber;
//     }
// }

// class Programmer extends EmployeeInfo {
//     double basicPay;
//     double da;
//     double hra;
//     double pf;
//     double staffClubFund;

//     public Programmer(double basicPay, String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber) {
//         super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber);
//         this.basicPay = basicPay;
//         this.da = 0.97 * basicPay;
//         this.hra = 0.10 * basicPay;
//         this.pf = 0.12 * basicPay;
//         this.staffClubFund = 0.001 * basicPay;
//     }

//     void printSalary() {
//         double grossSalary = basicPay + da + hra;
//         double netSalary = grossSalary - pf - staffClubFund;
//         System.out.println("Employee Name : " + employeeName);
//         System.out.println("Employee ID : " + employeeId);
//         System.out.println("Employee Address : " + employeeAddress);
//         System.out.println("Employee Mail ID : " + employeeMailId);
//         System.out.println("Employee Mobile Number : " + employeeMobileNumber);
//         System.out.println("Gross Salary : " + grossSalary);
//         System.out.println("Net Salary : " + netSalary);
//     }
// }

// class AssistantProfessor extends EmployeeInfo {
//     double basicPay;
//     double da;
//     double hra;
//     double pf;
//     double staffClubFund;

//     public AssistantProfessor(double basicPay, String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber) {
//         super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber);
//         this.basicPay = basicPay;
//         this.da = 0.97 * basicPay;
//         this.hra = 0.10 * basicPay;
//         this.pf = 0.12 * basicPay;
//         this.staffClubFund = 0.001 * basicPay;
//     }

//     void printSalary() {
//         double grossSalary = basicPay + da + hra;
//         double netSalary = grossSalary - pf - staffClubFund;
//         System.out.println("Employee Name : " + employeeName);
//         System.out.println("Employee ID : " + employeeId);
//         System.out.println("Employee Address : " + employeeAddress);
//         System.out.println("Employee Mail ID : " + employeeMailId);
//         System.out.println("Employee Mobile Number : " + employeeMobileNumber);
//         System.out.println("Gross Salary : " + grossSalary);
//         System.out.println("Net Salary : " + netSalary);
//     }
// }

// class AssociateProfessor extends EmployeeInfo {
//     double basicPay;
//     double da;
//     double hra;
//     double pf;
//     double staffClubFund;

//     public AssociateProfessor(double basicPay, String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber) {
//         super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber);
//         this.basicPay = basicPay;
//         this.da = 0.97 * basicPay;
//         this.hra = 0.10 * basicPay;
//         this.pf = 0.12 * basicPay;
//         this.staffClubFund = 0.001 * basicPay;
//     }

//     void printSalary() {
//         double grossSalary = basicPay + da + hra;
//         double netSalary = grossSalary - pf - staffClubFund;
//         System.out.println("Employee Name : " + employeeName);
//         System.out.println("Employee ID : " + employeeId);
//         System.out.println("Employee Address : " + employeeAddress);
//         System.out.println("Employee Mail ID : " + employeeMailId);
//         System.out.println("Employee Mobile Number : " + employeeMobileNumber);
//         System.out.println("Gross Salary : " + grossSalary);
//         System.out.println("Net Salary : " + netSalary);
//     }
// }

// class Professor extends EmployeeInfo {
//     double basicPay;
//     double da;
//     double hra;
//     double pf;
//     double staffClubFund;

//     public Professor(double basicPay, String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber) {
//         super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber);
//         this.basicPay = basicPay;
//         this.da = 0.97 * basicPay;
//         this.hra = 0.10 * basicPay;
//         this.pf = 0.12 * basicPay;
//         this.staffClubFund = 0.001 * basicPay;
//     }

//     void printSalary() {
//         double grossSalary = basicPay + da + hra;
//         double netSalary = grossSalary - pf - staffClubFund;
//         System.out.println("Employee Name : " + employeeName);
//         System.out.println("Employee ID : " + employeeId);
//         System.out.println("Employee Address : " + employeeAddress);
//         System.out.println("Employee Mail ID : " + employeeMailId);
//         System.out.println("Employee Mobile Number : " + employeeMobileNumber);
//         System.out.println("Gross Salary : " + grossSalary);
//         System.out.println("Net Salary : " + netSalary);
//     }
// }

// public class PaySlipGenerationUsingInheritance {
//     public static void main(String[] args) {
//         Programmer programmer = new Programmer(10000, "John Doe", 1, "123 Main St", "john.doe@example.com", 1234567890);
//         programmer.printSalary();

//         AssistantProfessor assistantProfessor = new AssistantProfessor(20000, "Jane Smith", 2, "456 Elm St", "jane.smith@example.com", 1234567891);
//         assistantProfessor.printSalary();

//         AssociateProfessor associateProfessor = new AssociateProfessor(30000, "Robert Brown", 3, "789 Oak St", "robert.brown@example.com", 1234567892);
//         associateProfessor.printSalary();

//         Professor professor = new Professor(50000, "Emily Davis", 4, "101 Pine St", "emily.davis@example.com", 1234567893);
//         professor.printSalary();
//     }
// }


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// chatgpt code :


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

    public EmployeeInfo(String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber, double basicPay) {
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
    public Programmer(String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber, double basicPay) {
        super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber, basicPay);
    }
}

class AssistantProfessor extends EmployeeInfo {
    public AssistantProfessor(String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber, double basicPay) {
        super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber, basicPay);
    }
}

class AssociateProfessor extends EmployeeInfo {
    public AssociateProfessor(String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber, double basicPay) {
        super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber, basicPay);
    }
}

class Professor extends EmployeeInfo {
    public Professor(String employeeName, int employeeId, String employeeAddress, String employeeMailId, long employeeMobileNumber, double basicPay) {
        super(employeeName, employeeId, employeeAddress, employeeMailId, employeeMobileNumber, basicPay);
    }
}

public class PaySlipGenerationUsingInheritance {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("A", 1, "abc", "test@test.com", 1234567890, 10000);
        programmer.printSalary();

        AssistantProfessor assistantProfessor = new AssistantProfessor("B", 2, "def", "test@test.com", 1234567891, 20000);
        assistantProfessor.printSalary();

        AssociateProfessor associateProfessor = new AssociateProfessor("C", 3, "ghi", "test@test.com", 1234567892, 30000);
        associateProfessor.printSalary();

        Professor professor = new Professor("D", 4, "jkl", "test@test.com", 1234567893, 50000);
        professor.printSalary();
    }
}