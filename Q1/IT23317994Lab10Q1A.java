import java.util.Scanner;

public class IT23317994Lab10Q1A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mark: ");
        int mark = input.nextInt();

        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        System.out.println("Mark is Validated");
    }
}