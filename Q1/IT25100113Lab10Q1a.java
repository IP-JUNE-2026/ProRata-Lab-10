import java.util.Scanner;
public class IT25100113Lab10Q1a{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int mark;
		System.out.print("Enter the mark: ");
		mark=sc.nextInt();
		System.out.print("\n");

		assert(mark>=0 && mark<=100):"Invalid Mark";
		System.out.println("Mark is Validated");
	}
}