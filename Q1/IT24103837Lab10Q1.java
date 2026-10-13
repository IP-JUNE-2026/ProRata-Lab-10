import java.util.Scanner;

public class IT24103837Lab10Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mark (0-100): ");
        int mark = input.nextInt();

        // Part (a): Validate the mark using an assertion.
        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Part (b): Determine the grade.
        char grade;

        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Verify that the assigned grade matches the mark.
        char expectedGrade;
        if (mark >= 75) {
            expectedGrade = 'A';
        } else if (mark >= 60) {
            expectedGrade = 'B';
        } else if (mark >= 50) {
            expectedGrade = 'C';
        } else if (mark >= 40) {
            expectedGrade = 'D';
        } else {
            expectedGrade = 'F';
        }

        assert grade == expectedGrade : "Incorrect Grade Assigned";

        System.out.println("Grade: " + grade);

        input.close();
    }
}
