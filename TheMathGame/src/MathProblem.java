import java.util.Random;

public class MathProblem {
		public static char[] operators = {'+', '-', '*', '/', '%'};
		
		private int num1;
		private int num2;
		private char operator;
		public int problemNum;
		private int playerAnswer;
		public int actualAnswer;
		
		
		public void generateQuestion() {
			int rndOperator = new Random().nextInt(operators.length);
		
			num1 = new Random().nextInt(100);
			num2 = new Random().nextInt(100);
			
			switch (rndOperator) {
			case 0:
				operator = '+';
				break;
			case 1:
				operator = '-';
				break;
			case 2:
				operator = '*';
				break;
			case 3:
				operator = '/';
				break;
			case 4:
				operator = '%';
				break;
			}
		}
		
		public void printProblem() {
			System.out.println("\t\t" + num1);
			System.out.println("\t" + operator + "\t" + num2);
			System.out.println("\t-------------");
		}
		
		public boolean isAnswerRight() {
			if(playerAnswer == getAnswer()) {
				return true;
			} else {
				return false;
			}
		}
		
		public void recordAnswer(int enteredAnswer) {
			actualAnswer = getAnswer();
			playerAnswer = enteredAnswer;
		}
		
		public int getAnswer() {
			switch (operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*': 
				return num1 * num2;
			case '/': 
				return num1 / num2;
			case '%':
				return num1 % num2;
			}
			
			return 0;
		}
		
		
		
		public void printResults(int problemIndex) {
			
			if (isAnswerRight() == true) {
				System.out.println((problemIndex+1) + ")\t" + num1 + " " + operator + " " + num2 + " = " + "\t" + playerAnswer + "\t\t" + actualAnswer + "\t\tRight");
			} else {
				System.out.println((problemIndex+1) + ")\t" + num1 + " " + operator + " " + num2 + " = " + "\t" + playerAnswer + "\t\t" + actualAnswer + "\t\tWrong");
			}
			
		}
		
		
		
	}