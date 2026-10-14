import java.util.Scanner;

public class IT24102711Lab10Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input mark
        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        // Assert valid range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Determine grade
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

        // Assertion to verify correct grade assignment
        assert verifyGrade(mark, grade) : "Incorrect Grade Assigned";

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Helper method to verify grade logic
    public static boolean verifyGrade(int mark, char grade) {
        if (mark >= 75) {
            return grade == 'A';
        } else if (mark >= 60) {
            return grade == 'B';
        } else if (mark >= 50) {
            return grade == 'C';
        } else if (mark >= 40) {
            return grade == 'D';
        } else {
            return grade == 'F';
        }
    }
}
