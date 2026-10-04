import java.util.Scanner;

public class IT21127328Lab10Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        double mark = scanner.nextDouble();

        // Part (a): Assertion to check if mark is in valid range (0 to 100)
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("\nMark is Validated");

        // Part (b): Determine Grade
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

        // Part (b): Assertion to verify correct grade assignment
        assert (mark >= 75 && grade == 'A') ||
               (mark >= 60 && mark < 75 && grade == 'B') ||
               (mark >= 50 && mark < 60 && grade == 'C') ||
               (mark >= 40 && mark < 50 && grade == 'D') ||
               (mark < 40 && grade == 'F') : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        scanner.close();
    }
}