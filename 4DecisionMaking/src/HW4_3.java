import java.util.Scanner;

public class HW4_3 {

	public static void main(String[] args) {		
		
		int marks = readUserIntegerInput("Enter your marks:");
		
		if (marks > 90) {
			System.out.println("Your grade is an A+");
		} else if (marks > 80 && marks <= 90) {
			System.out.println("Your grade is an A");
		} else if (marks > 70 && marks <= 80) {
			System.out.println("Your grade is a B+");
		} else if (marks > 60 && marks <= 70) {
			System.out.println("Your grade is a B");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("Your grade is a C");
		} else if (marks < 50) {
			System.out.println("Congratulations! You failed.");
		}
	}
	
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}