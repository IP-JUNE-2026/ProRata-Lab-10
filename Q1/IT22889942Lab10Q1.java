import java.util.Scanner;

public class IT22889942Lab10Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // (a) Assert range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("\nMark is Validated");

        // (b) Determine grade
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

        // (b) Assert grade is correct
        boolean gradeCorrect;
        if (mark >= 75) {
            gradeCorrect = grade.equals("A");
        } else if (mark >= 60) {
            gradeCorrect = grade.equals("B");
        } else if (mark >= 50) {
            gradeCorrect = grade.equals("C");
        } else if (mark >= 40) {
            gradeCorrect = grade.equals("D");
        } else {
            gradeCorrect = grade.equals("F");
        }
        assert gradeCorrect : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }
}