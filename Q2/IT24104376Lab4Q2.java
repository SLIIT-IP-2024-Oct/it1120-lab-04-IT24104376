import java.util.Scanner;

public class IT24104376Lab4Q2 {
	public static void main (String[]arg){

		int exammark ;
		int labmark ;
		double perexam ;
		double perlab ;
		double finalmark ;

	Scanner input = new Scanner(System.in);

		System.out.print("Please enter Exam marks (out of 100) : ");
		exammark = input.nextInt();
			if(exammark<0 || exammark>100){
			System.out.print("Invalid input for Exam Marks. Terminating Program.");
			return ;
			}

		System.out.print("Enter your Lab submission marks (out of 100) : ");
		labmark = input.nextInt();
			if(labmark<0 || labmark>100){
			System.out.print("Invalid input for Lab Marks. Terminating Program.");
			return ;
			}

		System.out.print("Please enter the percentage given for the exam : ");
		perexam = input.nextDouble();

		System.out.print("Please enter the percentage given for the lab submission : ");
		perlab = input.nextDouble();
			if(perlab+perexam != 100){
			System.out.print("The percentages must add up to 100. Terminating Program.");
			return ;
			}

		finalmark = (exammark*perexam/100) + (labmark*perlab/100);

		System.out.println();
		System.out.println("Final exam mark is : " + finalmark);
	}
}