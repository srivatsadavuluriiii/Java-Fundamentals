/*
Create a class StudentGrade with member – determineGrade( ) that accepts
register number (String) and marks (float-type) of a student in all courses he
has registered for a particular semester. If the length of marks is 0 display –
"You have not registered for any course" else the method should display the
mark and the grade obtained in each course and a count of 'S' grade.
Note: The method should accept variable length argument for marks,
because
one student might have registered only for 5 courses, the other for 7 courses
and
so on.
Use the following criteria to determine the grade
Mark between 90.0 and 100.0 - Grade 'S'
between 80.0 and 89.0 - Grade 'A'
between 70.0 and 79.0 - Grade 'B'
between 60.0 and 69.0 - Grade 'C'
between 55.0 and 59.0 - Grade 'D'
between 50.0 and 54.0 - Grade 'E'
less than 50.0 – Grade 'F'
Create a main class that calls the above method for 5 students.
 */
// Thu June 13 2024

class StudentGrade {
    public void determineGrade(String registrationNumber, float... marks) {
        if (marks.length == 0) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("You have not registered for any course.");
            return;
        }

        int s_GradeCount = 0;
        System.out.println("Registration Number: " + registrationNumber);

        for (float mark : marks) {
            String grade;
            if (mark >= 90.0 && mark <= 100.0) {
                grade = "Grade 'S'";
                s_GradeCount++;
            } else if (mark >= 80.0 && mark <= 89.0) {
                grade = "Grade 'A'";
            } else if (mark >= 70.0 && mark <= 79.0) {
                grade = "Grade 'B'";
            } else if (mark >= 60.0 && mark <= 69.0) {
                grade = "Grade 'C'";
            } else if (mark >= 55.0 && mark <= 59.0) {
                grade = "Grade 'D'";
            } else if (mark >= 50.0 && mark <= 54.0) {
                grade = "Grade 'E'";
            } else {
                grade = "Grade 'F'";
            }
            System.out.println("Mark: " + mark + " - " + grade);
        }

        System.out.println("Count of 'S' Grade: " + s_GradeCount);
        System.out.println();
    }
}

public class student_grade_checker_using_methods {
    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade();

        System.out.println("Question 4 output : ");
        System.out.println();

        studentGrade.determineGrade("22BEC0343", 95.0f, 85.0f, 75.0f, 65.0f, 55.0f);
        studentGrade.determineGrade("22BEC0113", 92.0f, 82.0f, 72.0f, 62.0f);
        studentGrade.determineGrade("22BEC0543", 88.0f, 78.0f, 68.0f, 58.0f, 48.0f);
        studentGrade.determineGrade("22BEC0875", 99.0f, 89.0f, 79.0f, 69.0f, 59.0f);
        studentGrade.determineGrade("22BEC0321", 50.0f, 60.0f, 70.0f, 80.0f, 90.0f, 100.0f);
    }
}





