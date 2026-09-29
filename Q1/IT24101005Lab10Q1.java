import java.util.Scanner;

public class IT24101005Lab10Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // Part (a): validate the range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        System.out.println("Mark is Validated");

        // Part (b): determine the grade
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

        // Verify the grade assigned
        assert isGradeCorrect(mark, grade) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }

    // check of the grade against the mark ranges
	
    private static boolean isGradeCorrect(int mark, char grade) {
        switch (grade) {
            case 'A': return mark >= 75 && mark <= 100;
            case 'B': return mark >= 60 && mark <= 74;
            case 'C': return mark >= 50 && mark <= 59;
            case 'D': return mark >= 40 && mark <= 49;
            case 'F': return mark >= 0  && mark <= 39;
            default:  return false;
        }
    }
}