import java.util.Scanner;

public class  IT23648340Lab10Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mark: ");
        int mark = input.nextInt();

        // Assertion to validate mark
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Determine grade
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

        // Assertion to verify grade assignment
        assert ((mark >= 75 && grade == 'A') ||
                (mark >= 60 && mark <= 74 && grade == 'B') ||
                (mark >= 50 && mark <= 59 && grade == 'C') ||
                (mark >= 40 && mark <= 49 && grade == 'D') ||
                (mark < 40 && grade == 'F'))
                : "Incorrect Grade Assigned";

        System.out.println("Grade: " + grade);

        input.close();
    }
}