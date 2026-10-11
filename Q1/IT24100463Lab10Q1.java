import java.util.Scanner;

public class IT24100463Lab10Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = sc.nextInt();

        // a) Validate the mark using an assertion
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        System.out.println("\nMark is Validated");

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

        // Verify the grade using an assertion
        assert (grade == 'A' && mark >= 75)
            || (grade == 'B' && mark >= 60 && mark <= 74)
            || (grade == 'C' && mark >= 50 && mark <= 59)
            || (grade == 'D' && mark >= 40 && mark <= 49)
            || (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}