import java.util.Scanner;
public class IT25100113Lab10Q1b{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int mark;
		char grade;
		System.out.print("Enter the mark (0-100): ");
		mark=sc.nextInt();
		System.out.println("\n");
		assert(mark>=0 && mark<=100):"Invalid Mark";
		System.out.print("Mark is Validated");
		if(mark>=0 && mark<40)
			grade='F';
		else if(mark<50)
			grade='D';
		else if(mark<60)
			grade='C';
		else if(mark<75)
			grade='B';
		else if(mark<=100)
			grade='A';
		else
			grade='X';
		assert(mark>=75 && mark<=100 && grade=='A') ||
		(mark>=60 && mark<=74 && grade=='B') ||
		(mark>=50 && mark<=59 && grade=='C') ||
		(mark>=40 && mark<=49 && grade=='D') ||
		(mark>=0 && mark<=39 && grade=='F') :"Incorrect Grade Assigned";
		System.out.println("The Grade for the Entered Mark is: "+grade);
	}

}