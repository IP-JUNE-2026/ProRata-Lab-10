import java.util.Scanner;

public class IT23362758Lab10Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int mark;
        char grade;

        System.out.print("Enter Mark: ");
        mark = input.nextInt();

        assert (mark >= 0 && mark <= 100)
               : "Invalid Mark";

        System.out.println("Mark is Validated");

        if(mark >= 75)
        {
            grade = 'A';
        }
        else if(mark >= 60)
        {
            grade = 'B';
        }
        else if(mark >= 50)
        {
            grade = 'C';
        }
        else if(mark >= 40)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        assert
        (
            (mark >= 75 && grade == 'A') ||
            (mark >= 60 && mark <= 74 && grade == 'B') ||
            (mark >= 50 && mark <= 59 && grade == 'C') ||
            (mark >= 40 && mark <= 49 && grade == 'D') ||
            (mark < 40 && grade == 'F')
        )
        : "Incorrect Grade Assigned";

        System.out.println("Grade = " + grade);
    }
}