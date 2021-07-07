
public class HW7_3 {
	public static void main(String[] args) {
		int userInt = ReadUserInput.readUserIntegerInput("Enter a number between 1 and 100:");
		String userNum = numWord(userInt);
		System.out.println(userNum);
	}
	
	public static String numWord(int userInt) {
		String[] numArrayOne = new String[19];
		numArrayOne[0] = "One";
		numArrayOne[1] = "Two";
		numArrayOne[2] = "Three";
		numArrayOne[3] = "Four";
		numArrayOne[4] = "Five";
		numArrayOne[5] = "Six";
		numArrayOne[6] = "Seven";
		numArrayOne[7] = "Eight";
		numArrayOne[8] = "Nine";
		numArrayOne[9] = "Ten";
		numArrayOne[10] = "Eleven";
		numArrayOne[11] = "Twelve";
		numArrayOne[12] = "Thirteen";
		numArrayOne[13] = "Fourteen";
		numArrayOne[14] = "Fifteen";
		numArrayOne[15] = "Sixteen";
		numArrayOne[16] = "Seventeen";
		numArrayOne[17] = "Eighteen";
		numArrayOne[18] = "Nineteen";
		
		String[] numArrayTens = new String[8];
		numArrayTens[0] = "Twenty";
		numArrayTens[1] = "Thirty";
		numArrayTens[2] = "Forty";
		numArrayTens[3] = "Fifty";
		numArrayTens[4] = "Sixty";
		numArrayTens[5] = "Seventy";
		numArrayTens[6] = "Eighty";
		numArrayTens[7] = "Ninety";
		
		int ones = (userInt % 10);
		int tens = (userInt / 10);
		
		if (userInt <= 19) {
			return(numArrayOne[userInt - 1]);
		} else if (userInt < 100 && userInt % 10 != 0) {
			return(numArrayTens[tens - 2] + " " + numArrayOne[ones - 1].toLowerCase());
		} else if (userInt % 10 == 0 && userInt < 100) {
			return(numArrayTens[tens - 2]);
		} else if (userInt == 100) {
			return("One hundred");
		}
	
		return "";
		
	}
}
