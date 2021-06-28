// HW3_8 Swap value for 2 variables without using extra variable
public class HW3_8 {
	public static void main (String[] arg) {
		
		int numOne = 5;
		int numTwo = 9;
		
		System.out.println("Value of numOne before swapping is " + numOne + ", and value of numTwo before swapping is " + numTwo + ".");
		
		// Method #1 - Addition and Subtraction
		numOne = numOne + numTwo;
		numTwo = numOne - numTwo;
		numOne = numOne - numTwo;
		
		System.out.println("Value of numOne after swap #1 is " + numOne + ", and value of numTwo after swap #1 is " + numTwo + ".");
		
		// Method #2 - Multiplication and Division
		
		numOne = numOne * numTwo;
		numTwo = numOne / numTwo;
		numOne = numOne / numTwo;
		
		System.out.println("Value of numOne after swap #2 is " + numOne + ", and value of numTwo after swap #2 is " + numTwo + ".");
	}
}
