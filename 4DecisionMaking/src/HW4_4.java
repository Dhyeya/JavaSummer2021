import java.util.Scanner;

public class HW4_4 {

	public static void main(String[] args) {		
		
		String studentName = readUserStringInput("Enter your name:");
		
		int mathMarks = readUserIntegerInput("Enter your marks for Math:");
		int englishMarks = readUserIntegerInput("Enter your marks for English:");
		int latinMarks = readUserIntegerInput("Enter your marks for Latin:");
		int scienceMarks = readUserIntegerInput("Enter your marks for science:");
		
		
		if (mathMarks > 90) {
			mathMarks.equals("A+");
		} else if (mathMarks > 80 && mathMarks <= 90) {
			System.out.println("A");
		} else if (mathMarks > 70 && mathMarks <= 80) {
			System.out.println("B+");
		} else if (mathMarks > 60 && mathMarks <= 70) {
			System.out.println("B");
		} else if (mathMarks > 50 && mathMarks <= 60) {
			System.out.println("C");
		} else if (mathMarks < 50) {
			System.out.println("F");
		}
		
		if (englishMarks > 90) {
			System.out.println("A+");
		} else if (englishMarks > 80 && englishMarks <= 90) {
			System.out.println("A");
		} else if (englishMarks > 70 && englishMarks <= 80) {
			System.out.println("B+");
		} else if (englishMarks > 60 && englishMarks <= 70) {
			System.out.println("B");
		} else if (englishMarks > 50 && englishMarks <= 60) {
			System.out.println("C");
		} else if (englishMarks < 50) {
			System.out.println("F");
		}
		
		if (latinMarks > 90) {
			System.out.println("A+");
		} else if (latinMarks > 80 && latinMarks <= 90) {
			System.out.println("A");
		} else if (latinMarks > 70 && latinMarks <= 80) {
			System.out.println("B+");
		} else if (latinMarks > 60 && latinMarks <= 70) {
			System.out.println("B");
		} else if (latinMarks > 50 && latinMarks <= 60) {
			System.out.println("C");
		} else if (latinMarks < 50) {
			System.out.println("F");
		}
		
		if (scienceMarks > 90) {
			System.out.println("A+");
		} else if (scienceMarks > 80 && scienceMarks <= 90) {
			System.out.println("A");
		} else if (scienceMarks > 70 && scienceMarks <= 80) {
			System.out.println("B+");
		} else if (scienceMarks > 60 && scienceMarks <= 70) {
			System.out.println("B");
		} else if (scienceMarks > 50 && scienceMarks <= 60) {
			System.out.println("C");
		} else if (scienceMarks < 50) {
			System.out.println("F");
		}
	}
	
	public static String readUserStringInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}