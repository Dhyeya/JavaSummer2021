
public class HW6_10 {
	public static void main(String[] args) {
		int userInteger = ReadUserInput.readUserIntegerInput("Enter a number:");
		int index;
		String userFactors = "";
		
		for(index = 1; index <= userInteger; index++) {
			if(userInteger % index == 0) {
				if(index == userInteger) {
					userFactors = userFactors + Integer.toString(index);
				} else {
					userFactors = userFactors + Integer.toString(index) + ", ";
				}
			}
		}
		System.out.println(userFactors);
	}
}
