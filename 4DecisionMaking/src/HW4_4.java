import java.util.Scanner;

public class HW4_4 {

	public static void main(String[] args) {		
		
		String studentName = readUserStringInput("Enter your name:");
		
		int mathMarks = readUserIntegerInput("Enter your marks for Math:");
		int englishMarks = readUserIntegerInput("Enter your marks for English:");
		int latinMarks = readUserIntegerInput("Enter your marks for Latin:");
		int scienceMarks = readUserIntegerInput("Enter your marks for Science:");
		
		int totalMarks = mathMarks + englishMarks + latinMarks + scienceMarks;
		
		int avgMarks = totalMarks/4;
		
		System.out.println("Student Name : " + studentName);
		System.out.println("-----------------------------------");
		System.out.println("Subject         | Marks    | Grade |");
		System.out.println("-----------------------------------");
				if (mathMarks > 90) {
					System.out.println("Math            | " + mathMarks + "       | " +"A+    |");
				} else if (mathMarks > 80 && mathMarks <= 90) {
					System.out.println("Math            | " + mathMarks + "       | " +"A     |");
				} else if (mathMarks > 70 && mathMarks <= 80) {
					System.out.println("Math            | " + mathMarks + "       | " +"B+    |");
				} else if (mathMarks > 60 && mathMarks <= 70) {
					System.out.println("Math            | " + mathMarks + "       | " +"B     |");
				} else if (mathMarks > 50 && mathMarks <= 60) {
					System.out.println("Math            | " + mathMarks + "       | " +"C     |");
				} else if (mathMarks < 50) {
					System.out.println("Math            | " + mathMarks + "       | " +"F     |");
				};
	
				if (englishMarks > 90) {
					System.out.println("English         | " + englishMarks + "       | " +"A+    |");
				} else if (englishMarks > 80 && englishMarks <= 90) {
					System.out.println("English         | " + englishMarks + "       | " +"A     |");
				} else if (englishMarks > 70 && englishMarks <= 80) {
					System.out.println("English         | " + englishMarks + "       | " +"B+    |");
				} else if (englishMarks > 60 && englishMarks <= 70) {
					System.out.println("English         | " + englishMarks + "       | " +"B     |");
				} else if (englishMarks > 50 && englishMarks <= 60) {
					System.out.println("English         | " + englishMarks + "       | " +"C     |");
				} else if (englishMarks < 50) {
					System.out.println("English         | " + englishMarks + "       | " +"F     |");
				}
				
				if (latinMarks > 90) {
					System.out.println("Latin           | " + latinMarks + "       | " +"A+    |");
				} else if (latinMarks > 80 && latinMarks <= 90) {
					System.out.println("Latin           | " + latinMarks + "       | " +"A     |");
				} else if (latinMarks > 70 && latinMarks <= 80) {
					System.out.println("Latin           | " + latinMarks + "       | " +"B+    |");
				} else if (latinMarks > 60 && latinMarks <= 70) {
					System.out.println("Latin           | " + latinMarks + "       | " +"B     |");
				} else if (latinMarks > 50 && latinMarks <= 60) {
					System.out.println("Latin           | " + latinMarks + "       | " +"C     |");
				} else if (latinMarks < 50) {
					System.out.println("Latin           | " + latinMarks + "       | " +"F     |");
				}
		
				if (scienceMarks > 90) {
					System.out.println("Science         | " + scienceMarks + "       | " +"A+    |");
				} else if (scienceMarks > 80 && scienceMarks <= 90) {
					System.out.println("Science         | " + scienceMarks + "       | " +"A     |");
				} else if (scienceMarks > 70 && scienceMarks <= 80) {
					System.out.println("Science         | " + scienceMarks + "       | " +"B+    |");
				} else if (scienceMarks > 60 && scienceMarks <= 70) {
					System.out.println("Science         | " + scienceMarks + "       | " +"B     |");
				} else if (scienceMarks > 50 && scienceMarks <= 60) {
					System.out.println("Science         | " + scienceMarks + "       | " +"C     |");
				} else if (scienceMarks < 50) {
					System.out.println("Science         | " + scienceMarks + "       | " +"F     |");
				}
				System.out.println("-------------------------------------");
				System.out.println("Overall         | " + totalMarks + "/400" + "          |");
				
				if (avgMarks > 90 ) {
					System.out.println("Overall %       | " + avgMarks + " %     | A+    |");
				} else if (avgMarks > 80 && avgMarks <=90) {
					System.out.println("Overall %       | " + avgMarks + " %     | A     |");
				} else if (avgMarks > 70 && avgMarks <=80) {
					System.out.println("Overall %       | " + avgMarks + " %     | B+    |");
				} else if (avgMarks > 60 && avgMarks <=70) {
					System.out.println("Overall %       | " + avgMarks + " %     | B     |");
				} else if (avgMarks > 50 && avgMarks <= 60 ) {
					System.out.println("Overall %       | " + avgMarks + " %     | C     |");
				} else if (avgMarks < 50) {
					System.out.println("Overall %       | " + avgMarks + " %     | F     |");
				}
				System.out.println("-------------------------------------");
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