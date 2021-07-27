
public class MathGame {
	public static void main(String[] args) {
		System.out.println("\t\tWelcome to the math game!");
		String playerName = ReadUserInput.readUserStringInput("Enter player name:");
		int playerAnswer;
		int problemCounter;
		int score = 0;

		MathProblem[] problems = new MathProblem[10];

		for (problemCounter = 0; problemCounter < problems.length; problemCounter++) {
			problems[problemCounter] = new MathProblem();
			problems[problemCounter].generateQuestion();
			problems[problemCounter].printProblem();
			playerAnswer = ReadUserInput.readUserIntegerInput("Enter your answer:\t");
			problems[problemCounter].recordAnswer(playerAnswer);
		}

		System.out.println("");
		System.out.println("Sr.No.\tProblem\t\tUser Answer\tActual Answer\tResult");
		System.out.println("----------------------------------------------------------------------");
		for (problemCounter = 0; problemCounter < problems.length; problemCounter++) {
			problems[problemCounter].printResults(problemCounter);
			if(problems[problemCounter].isAnswerRight() == true) {
				score++;
			}
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total                                                     " + score + "/10");
	}
}
