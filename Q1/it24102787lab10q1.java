import java.util.Scanner;

public class  {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark(0-100):");
        double marks = input.nextDouble();

        System.out.println();
        
        if(marks >=0 && marks <=100){
            System.out.println("Marks is validated");
            if(marks>=75){
                System.out.println("The grade for the Enter Marks A");
            } else if (marks>=60) {
                System.out.println("The Grade For the Entered Marks is: B");
            } else if (marks>=50) {
                System.out.println("The Grade For the Entered Marks is: C");
            } else if (marks>=60) {
                System.out.println("The Grade For the Entered Marks is: D");
            }
            else {
                System.out.println("The Grade For the Entered Marks is: F");

            }
        }
        assert marks >= 0 && marks <=100:"Incorrect grade assign";
    }
}