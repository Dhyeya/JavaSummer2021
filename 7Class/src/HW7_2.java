
public class HW7_2 {
	public static void main(String[] args) {
		int userYear = ReadUserInput.readUserIntegerInput("Enter a year:");
		boolean isLeapYear = leapYear(userYear);
		
		if (isLeapYear == true) {
			System.out.println(userYear + " is a leap year.");
		} else if (isLeapYear == false) {
			System.out.println(userYear + " is not a leap year.");
		}

	}

	public static boolean leapYear(int userYear) {

		if (userYear % 4 == 0 && userYear % 100 != 0) {
			return true;
		} else {
			return false;
		}

	}

}
