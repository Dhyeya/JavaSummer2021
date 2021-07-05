
public class HW6_8Flipped {
	public static void main(String[] args) {
		int rows;
		int columns;
		int spaces;

		for (rows = 1; rows <= 5; rows++) {
			for (spaces = 1; spaces <= rows; spaces++) {
				System.out.print(" ");
			}
		for (columns = 1; columns <= 6 - rows; columns++) {
			System.out.print(" *");
		}
		System.out.println("");
	}
}
}