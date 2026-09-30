import java.util.Scanner;

public class IT22212122Lab10Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 -100): ");
        int mark = input.nextInt();

        assert mark >= 0 && mark <= 100 : "Invalid Mark";

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

        if (mark >= 75) {
            assert grade.equals("A") : "Incorrect Grade Assigned";
        } else if (mark >= 60) {
            assert grade.equals("B") : "Incorrect Grade Assigned";
        } else if (mark >= 50) {
            assert grade.equals("C") : "Incorrect Grade Assigned";
        } else if (mark >= 40) {
            assert grade.equals("D") : "Incorrect Grade Assigned";
        } else {
            assert grade.equals("F") : "Incorrect Grade Assigned";
        }

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}