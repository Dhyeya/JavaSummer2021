
public class HW7_7 {
	public static void main(String[] args) {
		String userWord = ReadUserInput.readUserStringInput("Enter a word:");
		String userWordFlipped = flipWord(userWord);
	
		
		if (userWord.equalsIgnoreCase(userWordFlipped)) {
			System.out.println("The word you entered is a palindrome.");
		} else {
			System.out.println("The word you entered is not a palindrome.");
		}
	}
	public static String flipWord(String userWord) {
		int index = 0;
		String flippedWord = "";
		for(index = userWord.length() - 1; index >= 0; index--) {
			
			flippedWord = flippedWord + userWord.toCharArray()[index];
		}
		return flippedWord;
		
		
	}
}
