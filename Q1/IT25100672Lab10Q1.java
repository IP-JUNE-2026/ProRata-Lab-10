import java.util.Scanner;

public class IT25100672Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        // Part (a): Validate mark range using assertion
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        System.out.println("Mark is Validated");

        // Part (b): Determine grade
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

        // Validate assigned grade using assertion
        boolean isGradeCorrect = switch (grade) {
            case 'A' -> mark >= 75;
            case 'B' -> mark >= 60 && mark < 75;
            case 'C' -> mark >= 50 && mark < 60;
            case 'D' -> mark >= 40 && mark < 50;
            case 'F' -> mark < 40;
            default -> false;
        };

        assert isGradeCorrect : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is " + grade);

        scanner.close();
    }
}