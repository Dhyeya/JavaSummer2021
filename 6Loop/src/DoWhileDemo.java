
public class DoWhileDemo {
	public static void main(String[] args) {
		boolean doContinue = false;
		
		do {
			String userInput = ReadUserInput.readUserStringInput("Enter option :");
		if (userInput.equalsIgnoreCase("FC")) {
			System.out.println("F to C");
			String doYouWantToContinue = ReadUserInput.readUserStringInput("Continue? Y/N :");
			if (doYouWantToContinue.equalsIgnoreCase("Y")) {
				doContinue = true;
			}
		} else if(userInput.equalsIgnoreCase("CF")) {
			System.out.println("C to F");
			String doYouWantToContinue = ReadUserInput.readUserStringInput("Continue? Y/N :");
			if (doYouWantToContinue.equalsIgnoreCase("Y")) {
				doContinue = true;
			}
		} else {
			System.out.println("Invalid input. Try again.");
			doContinue = true;
		}
	}	while (doContinue);
		
		
	} 
}
