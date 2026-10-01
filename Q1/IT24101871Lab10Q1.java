import java.util.Scanner;

public class IT24101871Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part a: Check if the mark is within the valid range
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();

        // Assertion to verify the mark is within range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Part b: Determine the grade based on the mark
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

        // Assertion to verify the grade is correctly assigned
        assert ((mark >= 75 && grade == 'A') || 
                (mark >= 60 && mark < 75 && grade == 'B') || 
                (mark >= 50 && mark < 60 && grade == 'C') || 
                (mark >= 40 && mark < 50 && grade == 'D') || 
                (mark < 40 && grade == 'F')) : "Incorrect Grade Assigned";

        // Display the grade
        System.out.println("The grade is: " + grade);
    }
}