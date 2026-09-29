import java.util.Scanner;

public class IT23317994Lab10Q1B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mark: ");
        int mark = input.nextInt();

        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        String grade;

        if (mark >= 75)
        {
            grade = "A";
        }
        else if (mark >= 60)
        {
            grade = "B";
        }
        else if (mark >= 50)
        {
            grade = "C";
        }
        else if (mark >= 40)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }

        assert grade.equals("A") ||
               grade.equals("B") ||
               grade.equals("C") ||
               grade.equals("D") ||
               grade.equals("F") : "Incorrect Grade Assigned";

        System.out.println("Grade = " + grade);
    }
}