import java.util.Scanner;

public class IT22344038Lab10Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // Part a: check the mark is within 0 to 100 (inclusive)
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        System.out.println("\nMark is Validated");

        // Part b: determine the grade and verify it
        char grade = determineGrade(mark);
        assert isCorrectGrade(mark, grade) : "Incorrect Grade Assigned";
        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }

    public static char determineGrade(int mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else if (mark >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Independent check: confirms the grade matches the mark's range
    public static boolean isCorrectGrade(int mark, char grade) {
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