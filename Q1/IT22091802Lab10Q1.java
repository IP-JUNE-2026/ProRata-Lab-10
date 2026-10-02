import java.util.Scanner;

public class IT22091802Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        // ASSERTION 1: verify mark is within valid range 0 to 100
        // assert condition : "error message if condition is FALSE";
        // If mark is outside range, program STOPS with AssertionError
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        // Only reaches here if assertion passed (mark is valid)
        System.out.println("Mark is Validated");

        // Determine grade based on mark
        String grade;
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // ASSERTION 2: verify the grade assigned is correct
        // Checks that grade matches the correct range for the mark
        assert (mark >= 75 && grade.equals("A")) ||
               (mark >= 60 && mark < 75 && grade.equals("B")) ||
               (mark >= 50 && mark < 60 && grade.equals("C")) ||
               (mark >= 40 && mark < 50 && grade.equals("D")) ||
               (mark < 40  && grade.equals("F")) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}