
public class BranchingDemo {
	public static void main(String[] args) {
		while (true) {
			String userInput = ReadUserInput.readUserStringInput("Enter your choice: ");
			if (userInput.equalsIgnoreCase("E")) {
				System.out.println("Ending loop");
				break;
			} else {
				System.out.println("You entered " + userInput);
			}

			System.out.println("Continue");
		}
	}
}
