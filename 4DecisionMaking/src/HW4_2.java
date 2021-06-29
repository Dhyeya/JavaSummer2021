// HW4_2
import java.util.Scanner;

public class HW4_2 {

	public static void main(String[] args) {		
		
		int L = readUserIntegerInput("Enter loan amount (in dollars):");
		int I = readUserIntegerInput("Enter interest rate (rate per annum divided by 12):");
		int N = readUserIntegerInput("Enter loan period in months:");
		
		int equatedMonthlyInstallment = (L*I)* ((1+I)^N / ((1+I)^N)-1);
		
		int rate = I /(12*100);
		int doubleEquatedMonthlyInstallment = (int) ((L*rate*Math.pow(1+rate,N))/(Math.pow(1+rate,N)-1));
	
	System.out.println("Your equated monthly installment is " + equatedMonthlyInstallment + " dollars.");	
	
	}
	
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}