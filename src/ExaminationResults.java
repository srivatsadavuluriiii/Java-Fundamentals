

/*Examination results of 10 students are tabulated as follows:
Roll no, Subject1, Subject2, Subject3

Write a program to read data and determine the following:
(a) Total marks obtained by each student.
(b) Highest marks in each subject and the Rollno of the student who secured it.
(c) The student who obtained the highest total marks. */
// Thu June 06, 2024

// import java.util.Scanner;

// class result {
//     String roll_num;
//     int subject_1;
//     int subject_2;
//     int subject_3;
//     int total = subject_1 + subject_2 + subject_3;

//     public result() {
//         this.roll_num = "";
//         this.subject_1 = 0;
//         this.subject_2 = 0;
//         this.subject_3 = 0;
//         this.total = 0;

//     }

//     public result(String roll_num, int subject_1, int subject_2, int subject_3) {
//         this.roll_num = roll_num;
//         this.subject_1 = subject_1;
//         this.subject_2 = subject_2;
//         this.subject_3 = subject_3;
//         this.total = total;

//     }
// }



// public class student_marks_calc {
//     public static void main(String[] args) {

//         Scanner parent_object = new Scanner(System.in);
//         System.out.print("Number of Students : ");
//         int num = parent_object.nextInt();

//         for (int i = 0; i < num; i++) {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter roll no: ");
//             String roll_no = sc.nextLine();
//             System.out.print("Enter marks of subject 1: ");
//             int subject_1 = sc.nextInt();
//             System.out.print("Enter marks of subject 2: ");
//             int subject_2 = sc.nextInt();
//             System.out.print("Enter marks of subject 3: ");
//             int subject_3 = sc.nextInt();

//             int[] marks_array = {subject_1, subject_2, subject_3};
//             System.out.println(marks_array[0] + ", " + marks_array[1] + ", " + marks_array[2]);

//         }




//     }

    
// }


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

public class ExaminationResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        // Taking input for 3 students
        for (int i = 0; i < 3; i++) {
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

        // b) Highest marks in each subject and the Rollno of the student who secured it
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