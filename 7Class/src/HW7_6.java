
public class HW7_6 {
	public static void main(String[] args) {
		String userSentence = ReadUserInput.readUserStringInput("Enter a sentence:");
		int numberOfChar = charCount(userSentence);
		System.out.println("Number of letters is " + numberOfChar);
	}

	public static int charCount(String userSentenceX) {
		int numOfChar = 0;
		int index = 0;
		for (index = 0; index < userSentenceX.toCharArray().length; index++) {
			char ch = userSentenceX.toCharArray()[index];
			if (ch != ' ') {
				numOfChar++;
			} 
		}
		return numOfChar;

	}
}
