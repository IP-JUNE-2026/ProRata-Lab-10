import java.util.Scanner;

public class IT22206350Lab10Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // a) Assertion 1 - check the mark is within the valid range (0 - 100)
        //    Run with: java -ea IT22206350Lab10Q1
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println();
        System.out.println("Mark is Validated");

        // b) Determine the grade
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

        // Assertion 2 - check the grade assigned matches the mark range
        assert (grade == 'A' && mark >= 75)
            || (grade == 'B' && mark >= 60 && mark <= 74)
            || (grade == 'C' && mark >= 50 && mark <= 59)
            || (grade == 'D' && mark >= 40 && mark <= 49)
            || (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}
