// HW3_7 Swap value for 2 variables
public class HW3_7 {
	public static void main (String[] arg) {
		// Define 2 variables and swap the values and print both variable values.
		int numOne = 4;
		int numTwo = 7;
		int numTemp = numOne;
		
		System.out.println("Values for numOne and numTwo before the swap are: " + numOne + " and " + numTwo + ", respectively.");

		
		numOne = numTwo;
		numTwo = numTemp;
		
		System.out.println("Values for numOne and numTwo after the swap are: " + numOne + " and " + numTwo + ", respectively.");
	}
}
