import java.util.Scanner;

public class IT23249820Lab10Q1 {

    public static char calculateGrade(int mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else if (mark >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // Part (a): Validate the entered mark
        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        char grade = calculateGrade(mark);

        // Part (b): Verify that the correct grade was assigned
        boolean correctGrade =
                (mark >= 75 && grade == 'A')
                || (mark >= 60 && mark <= 74 && grade == 'B')
                || (mark >= 50 && mark <= 59 && grade == 'C')
                || (mark >= 40 && mark <= 49 && grade == 'D')
                || (mark >= 0 && mark <= 39 && grade == 'F');

        assert correctGrade : "Incorrect Grade Assigned";

        System.out.println("Mark is Validated");
        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }
}