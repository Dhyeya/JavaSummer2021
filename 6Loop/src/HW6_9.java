
public class HW6_9 {
	public static void main(String[] args) {
		
		int userAge = ReadUserInput.readUserIntegerInput("Enter your age:");
		String validLicense = ReadUserInput.readUserStringInput("Do you have a valid driving license? (Y/N:)");
		
			if (userAge >= 18 && validLicense.equalsIgnoreCase("Y")) {
				System.out.println("You are eligible to drive a car.");
			} else {
				System.out.println("Sorry, you must wait " + (18-userAge) + " more years to drive a car.");
				}
		}
}
