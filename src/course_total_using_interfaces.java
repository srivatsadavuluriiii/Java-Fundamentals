/*
Create an interface called CourseTotal with a method Total() that returns
the total marks. Create another interface called CourseAverage with method
Average(int total) that returns a string. Create a class called Result which
implements both CourseInfo and CourseAverage. The Average() method
calaculate the average marks and return “First” if the average is greater than
or equal to 60, “Second” if the average is greater than or equal to 50,”Fail” if
the average is less than 50.
 */
// Thu June 13 2024

interface CourseTotal { int Total();}
interface CourseAverage { String Average(int total);}

class Result implements CourseTotal, CourseAverage {
    int[] marks;
    Result(int[] marks) {
        this.marks = marks;
    }

    @Override
    public int Total() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    @Override
    public String Average(int total) {
        int numSubjects = marks.length;
        double average = (double) total / numSubjects;

        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "Fail";
        }
    }
}


public class course_total_using_interfaces {
    public static void main(String[] args) {

        System.out.println("Question 3 output : ");
        System.out.println();

        int[] marks = {80, 70, 60, 50, 40};
        Result object = new Result(marks);

        System.out.println("Total marks : " + object.Total());
        System.out.println("Average : " + object.Average(object.Total()));
    }
}
