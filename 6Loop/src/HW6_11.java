
public class HW6_11 {
	public static void main(String[] args) {
		int userNum = ReadUserInput.readUserIntegerInput("Enter a number:");
		int index;
		boolean compositeVal = false;
		
		for(index = 2; index < userNum; index++) {
			if(userNum % index == 0) {
				System.out.println("The number you entered, " + userNum + ", is composite");
				compositeVal = true;
				break;
			} 
		}	
		
		if (userNum < 0) {
			System.out.println("Invalid input");
		} else if (userNum < 2 && userNum >= 0) {
			System.out.println("This number is neither prime nor composite");
		} else if (userNum == 2) {
			System.out.println("The number you entered, " + userNum + ", is prime");
		} else if (compositeVal == false) {
			System.out.println("The number you entered, " + userNum + ", is prime");
		}
	}
}
