import java.util.Scanner;

public class HW5_3 {

	public static void main(String[] args) {		
		
		System.out.println("Key 					Description");
		System.out.println("------------------------------------------------------------");
		System.out.println("FC 					Fahrenheit -> Celsius");
		System.out.println("CF					Celsius -> Fahrenheit");
		
		System.out.println("");
		String tempConv = readUserStringInput("Enter conversion type:");
		 
		switch (tempConv) {
		case "FC":
			int F = readUserIntegerInput("Enter degrees in Fahrenheit:");
			System.out.println((F - 32) * 5/9);
			break;
		case "CF":
			int C = readUserIntegerInput("Enter degrees in Celsius:");
			System.out.println((C*9/5) + 32);
			break;
			
		default:
			System.out.println("Invalid");
		}

		
		/**if (tempConv == "FC") {
			int F = readUserIntegerInput("Enter degrees in Fahrenheit:");
			System.out.println((F - 32) * 5/9);
		} else if (tempConv == "CF") {
			int C = readUserIntegerInput("Enter degrees in Celsius:");
			System.out.println((C*9/5) + 32);
		}	
		*/
}
	
	
 	public static String readUserStringInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		 
		Scanner scanner = new Scanner(System.in);
			return scanner.next();
		
	}
	
	
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextInt();
		}
	}
	
}