
public class HW6_7Flipped {
	public static void main(String[] args) {
		int rows;
		int columns;
		
		for(rows = 1; rows <= 5; rows++) {
			for (columns = 1; columns <= 6-rows; columns++) {
				System.out.print("* ");
			}
		System.out.println("");
		}
	}
}
