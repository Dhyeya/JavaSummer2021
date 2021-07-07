
public class HW7_5 {
	public static void main(String[] args) {
		String userSentence = ReadUserInput.readUserStringInput("Enter a sentence:");
		int numberOfWord = wordCount(userSentence);
		System.out.println("Number of words is " + numberOfWord);
	}
	
	public static int wordCount(String userSentence) {
		int numOfWord = 0;
		int index = 0;
		for(index = 0; index < userSentence.toCharArray().length; index++) {
			char ch = userSentence.toCharArray()[index];
			if (ch == ' ') {
				numOfWord++;
			} 
		}
		numOfWord++;
		return numOfWord;
		
	}
}