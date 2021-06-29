// HW4_1
import java.util.Scanner;

public class HW4_1 {

	public static void main(String[] args) {		
		
		// 1. Take integer input from user and print if number is greater than 100
		int num1 = readUserIntegerInput("Enter a number:");
		
		if (num1 > 100) {
			System.out.println(num1 + " is greater than 100"); 
		} else {
			System.out.println(num1 + " is not greater than 100");
		}
		
		// 2. Take integer input from user and print if number is even of odd
		int num2 = readUserIntegerInput("Enter a number:");

		if (num2 %2 == 0) {
			System.out.println(num2 + " is even");
		} else {
			System.out.println(num2 + " is odd");
		}
		
		// 3. Take 4 integer input from user and print maximum number
		int numOneMax = readUserIntegerInput("Enter a number:");
		int numTwoMax = readUserIntegerInput("Enter a number:");
		int numThreeMax = readUserIntegerInput("Enter a number:");
		int numFourMax = readUserIntegerInput("Enter a number:");
		
		int biggestNumber;
		
		biggestNumber = numOneMax;
		if (numTwoMax > biggestNumber) {
			biggestNumber = numTwoMax;
		} if (numThreeMax > biggestNumber) {
			biggestNumber = numThreeMax;
		} if (numFourMax > biggestNumber) {
			biggestNumber = numFourMax;
		}
			System.out.println(biggestNumber + " is the greatest");
		
		// 4. Take 4 integer input from user and print minimum number
		int numOneMin = readUserIntegerInput("Enter a number:");
		int numTwoMin = readUserIntegerInput("Enter a number:");
		int numThreeMin = readUserIntegerInput("Enter a number:");
		int numFourMin = readUserIntegerInput("Enter a number");
		
		int smallestNumber;
		
		smallestNumber = numOneMin;
		if (numTwoMin < smallestNumber) {
			smallestNumber = numTwoMin;
		} if (numThreeMin < smallestNumber) {
			smallestNumber = numThreeMin;
		} if (numFourMin < smallestNumber) {
			smallestNumber = numFourMax;
		}
			System.out.println(smallestNumber + " is the smallest");
	}
	
public static int readUserIntegerInput (String aInputMsg) {
	System.out.print( aInputMsg + " ");
	Scanner scanner = new Scanner(System.in);
	return scanner.nextInt();
	}
}