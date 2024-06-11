

/*Examination results of 10 students are tabulated as follows:
Roll no, Subject1, Subject2, Subject3

Write a program to read data and determine the following:
(a) Total marks obtained by each student.
(b) Highest marks in each subject and the Rollno of the student who secured it.
(c) The student who obtained the highest total marks. */
// Thu June 06, 2024


import java.util.Scanner;

class Student {
    int rollNo;
    int subject1;
    int subject2;
    int subject3;
    int totalMarks;

    public Student(int rollNo, int subject1, int subject2, int subject3) {
        this.rollNo = rollNo;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.totalMarks = subject1 + subject2 + subject3;
    }
}

public class result {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Number of Students : ");
        int num = scanner.nextInt();

        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Subject 1 Marks: ");
            int subject1 = scanner.nextInt();
            System.out.print("Subject 2 Marks: ");
            int subject2 = scanner.nextInt();
            System.out.print("Subject 3 Marks: ");
            int subject3 = scanner.nextInt();
            students[i] = new Student(rollNo, subject1, subject2, subject3);
        }

        // a) Total marks obtained by each student
        System.out.println("\nTotal marks obtained by each student:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + ", Total Marks: " + student.totalMarks);
        }

        int highestSub1 = 0, highestSub2 = 0, highestSub3 = 0;
        int rollNoSub1 = 0, rollNoSub2 = 0, rollNoSub3 = 0;

        for (Student student : students) {
            if (student.subject1 > highestSub1) {
                highestSub1 = student.subject1;
                rollNoSub1 = student.rollNo;
            }
            if (student.subject2 > highestSub2) {
                highestSub2 = student.subject2;
                rollNoSub2 = student.rollNo;
            }
            if (student.subject3 > highestSub3) {
                highestSub3 = student.subject3;
                rollNoSub3 = student.rollNo;
            }
        }

        System.out.println("\nHighest marks in each subject:");
        System.out.println("Subject 1: " + highestSub1 + " (Roll No: " + rollNoSub1 + ")");
        System.out.println("Subject 2: " + highestSub2 + " (Roll No: " + rollNoSub2 + ")");
        System.out.println("Subject 3: " + highestSub3 + " (Roll No: " + rollNoSub3 + ")");

        // c) The student who obtained the highest total marks
        int highestTotalMarks = 0;
        int rollNoHighestTotal = 0;

        for (Student student : students) {
            if (student.totalMarks > highestTotalMarks) {
                highestTotalMarks = student.totalMarks;
                rollNoHighestTotal = student.rollNo;
            }
        }

        System.out.println("\nStudent who obtained the highest total marks:");
        System.out.println("Roll No: " + rollNoHighestTotal + ", Total Marks: " + highestTotalMarks);

        scanner.close();
        }
    }
}