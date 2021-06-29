import java.util.Scanner;

public class HW4_7 {

	public static void main(String[] args) {		
		
		int monthNum = readUserIntegerInput("Enter month number:");
		int yearNum = readUserIntegerInput("Enter year number:");
		
		switch (monthNum) {
		case 1:
			System.out.println("31");
			break;
		case 2:
			if (yearNum %4 == 0) {
				System.out.println("29");
			} else {
				System.out.println("28");
			}
			break;
		case 3:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 7:
			System.out.println("31");
			break;
		case 8:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 12:
			System.out.println("31");
			break;
			
		default:
			System.out.println("Invalid");
		}

	}
	
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}