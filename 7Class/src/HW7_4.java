public class HW7_4 {
	public static void main(String[] args) {
		int rows;
		int columns;
		String userChar = ReadUserInput.readUserStringInput("Enter a character:");
		
		
		for(rows = 1; rows <= 5; rows++) {
			for(columns = 1; columns <= rows ; columns++) {
				System.out.print(userChar + " ");
				
			}
			System.out.println("");
		}
	}
}
