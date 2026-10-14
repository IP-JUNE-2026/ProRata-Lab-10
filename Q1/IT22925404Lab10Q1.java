import java.util.Scanner;

public class IT22925404Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("\nMark is Validated");

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

        boolean isCorrect = false;

        if (mark >= 75 && grade == 'A') {
            isCorrect = true;
        }
        if (mark >= 60 && mark <= 74 && grade == 'B') {
            isCorrect = true;
        }
        if (mark >= 50 && mark <= 59 && grade == 'C') {
            isCorrect = true;
        }
        if (mark >= 40 && mark <= 49 && grade == 'D') {
            isCorrect = true;
        }
        if (mark < 40 && grade == 'F') {
            isCorrect = true;
        }

        assert isCorrect : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        scanner.close();
    }
}