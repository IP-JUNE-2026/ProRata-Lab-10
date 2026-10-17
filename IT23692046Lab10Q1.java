package Lab10;

import java.util.Scanner;

public class IT23692046Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read mark from the keyboard
        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        // a) Use assertions to verify that the mark is within the valid range of 0 to 100
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // b) Determine the corresponding letter grade based on the mark
        char grade = ' ';

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

        // Use assertions to verify that the correct grade has been assigned
        assert (grade == 'A' && mark >= 75 && mark <= 100) ||
               (grade == 'B' && mark >= 60 && mark < 75) ||
               (grade == 'C' && mark >= 50 && mark < 60) ||
               (grade == 'D' && mark >= 40 && mark < 50) ||
               (grade == 'F' && mark >= 0 && mark < 40) : "Incorrect Grade Assigned";

        // Display the assigned grade
        System.out.println("Assigned Grade: " + grade);

        scanner.close();
    }
}