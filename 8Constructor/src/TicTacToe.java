
public class TicTacToe {
	TicTacToeBox[] boxes = new TicTacToeBox[9];
	boolean gameOver = false;
	String winningPos;
	
	public void start() {
		System.out.println("Starting game");
		for(int boxCount = 0; boxCount < boxes.length; boxCount++) {
			boxes[boxCount] = new TicTacToeBox();
			boxes[boxCount].setPosition(boxCount + 1);
		}
		
		

		clearScreen();
		printTicTacToe();
	}
	
	
	
	public void printTicTacToe() {
		int gridNum = 1;
		for (gridNum = 1; gridNum <= 9; gridNum++) {
			if (boxes[gridNum - 1].isEmpty()) {
				System.out.print("     " + gridNum + " " + (boxes[gridNum - 1].getText()) + "     ");
			} else {
				System.out.print("     " + gridNum + " " + (boxes[gridNum - 1].getText()) + "    ");
			}
		
			if (gridNum % 3 == 0) {
				System.out.println("");
				System.out.print("------------------------------------");
				System.out.println("");
			} else {
				System.out.print("|");
			}
		}
	}
	
	public void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}
	
	public void recordAnswers() {
		for (int index = 0; index <= 8; index++) {
			if (index % 2 == 0) {
				int boxPos = ReadUserInput.readUserIntegerInput("Enter your position (X):");
				if (boxes[boxPos - 1].isEmpty() == false) {
					System.out.println("Sorry, that position is taken.");
					index--;
					continue;
				} 
				boxes[boxPos - 1].setText("X");
			} else {
				int boxPos = ReadUserInput.readUserIntegerInput("Enter your position (O):");
				if (boxes[boxPos - 1].isEmpty() == false) {
					System.out.println("Sorry, that position is taken.");
					index--;
					continue;
				} 
				boxes[boxPos - 1].setText("O");
			} 
			
			
			if (boxes[0].isEmpty() == false && boxes[0].getText().equals(boxes[1].getText()) && boxes[1].getText().equals(boxes[2].getText())) {
				winningPos = "1, 2, and 3";
				gameOver = true;
			} else if (boxes[3].isEmpty() == false && boxes[3].getText().equals(boxes[4].getText()) && boxes[4].getText().equals(boxes[5].getText())) {
				winningPos = "4, 5, and 6";
				gameOver = true;
			} else if (boxes[6].isEmpty() == false && boxes[6].getText().equals(boxes[7].getText()) && boxes[7].getText().equals(boxes[8].getText())) {
				winningPos = "7, 8, and 9";
				gameOver = true;
			} else if (boxes[0].isEmpty() == false && boxes[0].getText().equals(boxes[3].getText()) && boxes[3].getText().equals(boxes[6].getText())) {
				winningPos = "1, 4, and 7";
				gameOver = true;
			} else if (boxes[1].isEmpty() == false && boxes[1].getText().equals(boxes[4].getText()) && boxes[4].getText().equals(boxes[7].getText())) {
				winningPos = "2, 5, and 8";
				gameOver = true;
			} else if (boxes[2].isEmpty() == false && boxes[2].getText().equals(boxes[5].getText()) && boxes[5].getText().equals(boxes[8].getText())) {
				winningPos = "3, 6, and 9";
				gameOver = true;
			} else if (boxes[0].isEmpty() == false && boxes[0].getText().equals(boxes[4].getText()) && boxes[4].getText().equals(boxes[8].getText())) {
				winningPos = "1, 5, and 9";
				gameOver = true;
			} else if (boxes[2].isEmpty() == false && boxes[2].getText().equals(boxes[4].getText()) && boxes[4].getText().equals(boxes[6].getText())) {
				winningPos = "3, 5, and 7";
				gameOver = true;
			}
				if (gameOver == true) {
					clearScreen();
					System.out.println("Game over!");
					System.out.println("Winning positions are " + winningPos);
					printTicTacToe();
					break;
				} 
			
				clearScreen();
				printTicTacToe();
			}
		if (gameOver == false) {
			System.out.println("Draw!");
		}
		
	}
}
	

