
public class HW6_8 {
	public static void main(String[] args) {
		int rows;
		int columns;
		int spaces;

		for (rows = 1; rows <= 5; rows++) {
			for (spaces = 1; spaces <= 5 - rows; spaces++) {
				System.out.print(" ");
			}
			for (columns = 1; columns <= rows; columns++) {

				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
