import java.util.Scanner;

public class IT22199058Lab10Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println();
        System.out.println("Mark is Validated");

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

        assert isGradeCorrect(mark, grade) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }

    public static boolean isGradeCorrect(int mark, String grade) {
        if (mark >= 75) {
            return grade.equals("A");
        } else if (mark >= 60) {
            return grade.equals("B");
        } else if (mark >= 50) {
            return grade.equals("C");
        } else if (mark >= 40) {
            return grade.equals("D");
        } else {
            return grade.equals("F");
        }
    }
}