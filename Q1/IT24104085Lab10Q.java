import java.util.Scanner;

public class IT24104085Lab10Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();
        
        // Using assertion to check if the mark is within the valid range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        
        // If the assertion passes, print the validation message
        System.out.println("Mark is Validated");
    }
}
