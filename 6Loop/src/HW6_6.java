
public class HW6_6 {
	public static void main(String[] args) {
		int factor = ReadUserInput.readUserIntegerInput("Enter number:");
		int multiplier;
		
		for(multiplier = 1; multiplier <= 10; multiplier++) {
			System.out.println(factor + " X " + multiplier + " = " + factor*multiplier);
		}
	}
}
