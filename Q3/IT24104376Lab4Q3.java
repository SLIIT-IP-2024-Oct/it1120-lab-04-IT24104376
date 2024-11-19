import java.util.Scanner;

public class IT24104376Lab4Q3 {
	public static void main(String[]args) {

	int number;
	String result;

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number : ");
	number = input.nextInt();

	result = (number > 0) ? ": Positive" : (number < 0) ? ": Negative" : "Zero";

	System.out.println("The Number is " +result);
	}
}