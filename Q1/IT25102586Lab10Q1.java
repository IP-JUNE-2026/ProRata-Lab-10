import java.util.Scanner;

public class IT25102586Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark (0-100): ");
        int mark = scanner.nextInt();

        // Part (a): Validate mark range (0 to 100) using assertion
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";[cite: 1]
        System.out.println("Mark is Validated");[cite: 1]

        // Part (b): Determine Grade
        char grade;
        if (mark >= 75) {
            grade = 'A';[cite: 1]
        } else if (mark >= 60) {
            grade = 'B';[cite: 1]
        } else if (mark >= 50) {
            grade = 'C';[cite: 1]
        } else if (mark >= 40) {
            grade = 'D';[cite: 1]
        } else {
            grade = 'F';[cite: 1]
        }

        // Part (b): Verify assigned grade using assertion[cite: 1]
        assert ((mark >= 75 && grade == 'A') ||
                (mark >= 60 && mark < 75 && grade == 'B') ||
                (mark >= 50 && mark < 60 && grade == 'C') ||
                (mark >= 40 && mark < 50 && grade == 'D') ||
                (mark < 40 && grade == 'F')) : "Incorrect Grade Assigned";[cite: 1]

        System.out.println("The Grade for the Entered Mark is: " + grade);[cite: 1]

        scanner.close();
    }
}