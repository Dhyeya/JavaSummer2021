

public class Game {
	public static void main(String[] args) {

		String[] arrTicTacToe = new String[9];
		arrTicTacToe[0] = "";
		arrTicTacToe[1] = "";
		arrTicTacToe[2] = "";
		arrTicTacToe[3] = "";
		arrTicTacToe[4] = "";
		arrTicTacToe[5] = "";
		arrTicTacToe[6] = "";
		arrTicTacToe[7] = "";
		arrTicTacToe[8] = "";
		
		int index = 0;
		boolean gameOver = false;

		clearScreen();
		printTicTacToe(arrTicTacToe);
		
		for (index = 0; index <= 8; index++) {
			if (index % 2 == 0) {
				int boxPos = ReadUserInput.readUserIntegerInput("Enter your position (X):");
				if (!arrTicTacToe[boxPos - 1].equals("")) {
					System.out.println("Sorry, that position is taken.");
					index--;
					continue;
				} 
				arrTicTacToe[boxPos - 1] = "X";
			} else {
				int boxPos = ReadUserInput.readUserIntegerInput("Enter your position (O):");
				if (!arrTicTacToe[boxPos - 1].equals("")) {
					System.out.println("Sorry, that position is taken.");
					index--;
					continue;
				} 
				arrTicTacToe[boxPos - 1] = "O";
			} 
			if (!arrTicTacToe[0].equals("") && arrTicTacToe[0].equals(arrTicTacToe[1]) && arrTicTacToe[1].equals(arrTicTacToe[2])) {
				gameOver = true;
			} else if (!arrTicTacToe[3].equals("") && arrTicTacToe[3].equals(arrTicTacToe[4]) && arrTicTacToe[4].equals(arrTicTacToe[5])) {
				gameOver = true;
			} else if (!arrTicTacToe[6].equals("") && arrTicTacToe[6].equals(arrTicTacToe[7]) && arrTicTacToe[7].equals(arrTicTacToe[8])) {
				gameOver = true;
			} else if (!arrTicTacToe[0].equals("") && arrTicTacToe[0].equals(arrTicTacToe[3]) && arrTicTacToe[3].equals(arrTicTacToe[6])) {
				gameOver = true;
			} else if (!arrTicTacToe[1].equals("") && arrTicTacToe[1].equals(arrTicTacToe[4]) && arrTicTacToe[4].equals(arrTicTacToe[7])) {
				gameOver = true;
			} else if (!arrTicTacToe[2].equals("") && arrTicTacToe[2].equals(arrTicTacToe[5]) && arrTicTacToe[5].equals(arrTicTacToe[8])) {
				gameOver = true;
			} else if (!arrTicTacToe[0].equals("") && arrTicTacToe[0].equals(arrTicTacToe[4]) && arrTicTacToe[4].equals(arrTicTacToe[8])) {
				gameOver = true;
			} else if (!arrTicTacToe[2].equals("") && arrTicTacToe[2].equals(arrTicTacToe[4]) && arrTicTacToe[4].equals(arrTicTacToe[6])) {
				gameOver = true;
			}
				if (gameOver == true) {
					System.out.println("Game over!");
					break;
				}
				clearScreen();
				printTicTacToe(arrTicTacToe);
}
		if (gameOver == false) {
			System.out.println("Game over!");
		}
		
	}
	
	public static void printTicTacToe(String[] myTicTacToe) {
		int gridNum = 1;
		for (gridNum = 1; gridNum <= 9; gridNum++) {
			if (myTicTacToe[gridNum - 1].equals("")) {
				System.out.print("     " + gridNum + " " + (myTicTacToe[gridNum - 1]) + "     ");
			} else {
				System.out.print("     " + gridNum + " " + (myTicTacToe[gridNum - 1]) + "    ");
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
	
	public static void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}
}

