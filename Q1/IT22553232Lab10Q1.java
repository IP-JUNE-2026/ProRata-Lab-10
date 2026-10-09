import java.util.Scanner;

public class IT22553232Lab10Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        System.out.println();

        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

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

        assert (grade.equals("A") || grade.equals("B") || grade.equals("C") ||
                grade.equals("D") || grade.equals("F")) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        scanner.close();
    }
}