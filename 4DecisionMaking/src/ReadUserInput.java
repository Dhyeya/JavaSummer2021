import java.util.Scanner;

public class ReadUserInput {

	public static void main(String[] args) {		
		
		String name = readUserStringInput("Enter your name:");
		String lastName = readUserStringInput("Enter your last name:");
		System.out.print( "Your full name: " + name + " " + lastName + " :)");
		
		int num1 = readUserIntegerInput("Enter num1:");
		int num2 = readUserIntegerInput("Enter num2:");
		int sum = num1 + num2;
		System.out.println( "Sum " + sum );
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