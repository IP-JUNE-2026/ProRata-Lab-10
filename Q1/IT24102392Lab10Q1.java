import java.util.Scanner;
public class IT24102392Lab10Q1 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Define Variables
		int mark;
		char grade;
		
		//Getting inputs
		System.out.print("Enter the mark (0 - 100): ");
		mark = input.nextInt();
		
		assert (mark >= 0 && mark <= 100) : "Invalid Mark";
		System.out.println("");
		System.out.println("Mark is Validated");

                //Assigning Grade
		if (mark <= 100 && mark >= 75) {
		    grade = 'A';
		}
		else if (mark <= 74 && mark >= 60) {
			grade = 'B';
		}
		else if (mark <= 59 && mark >= 50) {
			grade = 'C';
		}
		else if (mark <= 49 && mark >= 40) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		//Assert to check grade
		assert (mark >= 75 && grade == 'A') || (mark <= 74 && mark >= 60 && grade == 'B') || (mark <= 59 && mark >= 50 && grade == 'C') || (mark <= 49 && mark >= 40 && grade == 'D') || (mark <= 39 && grade == 'F') : "Incorrect Grade Assigned";   
        System.out.println ("The Grade for the Entered Mark is: " +grade);		
			
	}
}