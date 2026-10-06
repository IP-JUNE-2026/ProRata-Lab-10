import java.util.Scanner;

public class IT22069504Lab10Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        System.out.println();
        System.out.println("Mark is Validated");

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

        char expectedGrade;

        if (mark >= 75) {
            expectedGrade = 'A';
        } else if (mark >= 60) {
            expectedGrade = 'B';
        } else if (mark >= 50) {
            expectedGrade = 'C';
        } else if (mark >= 40) {
            expectedGrade = 'D';
        } else {
            expectedGrade = 'F';
        }

        assert grade == expectedGrade : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }
}