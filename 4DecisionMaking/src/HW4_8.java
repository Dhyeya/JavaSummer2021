import java.util.Scanner;

public class HW4_8 {

	int CHEESE_PIZZA_COST = 10;
	int VEGGIE_PIZZA_COST = 15;
	int MEAT_LOVER_PIZZA_COST = 17;
	
	int STATE_TAX_PERCENTAGE = 6;
	
	public static void main(String[] args) {		
		
		int cheeseQuantity = readUserIntegerInput("Enter amount of cheese pizzas:");
		int veggieQuantity = readUserIntegerInput("Enter amount of veggie pizzas:");
		int meatQuantity = readUserIntegerInput("Enter amount of meat pizzas:");
		
		int cheeseTotalCost = cheeseQuantity*10;
		int veggieTotalCost = veggieQuantity*15;
		int meatTotalCost = meatQuantity*17;
		
		int totalCost = cheeseTotalCost + veggieTotalCost + meatTotalCost;
		
		double taxTotal = (cheeseTotalCost + veggieTotalCost + meatTotalCost)*0.06;
		
		double totalDue = totalCost + taxTotal;
		
		System.out.println("Dhyeya's Pizza Store");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Item          | Quantity  | Price per Item   |  Total   |");
		System.out.println("----------------------------------------------------------------");
		if (cheeseQuantity > 0) {
			System.out.println("Cheese pizza  | " + cheeseQuantity + "         | $10" + "              | $" + cheeseTotalCost + "              |");
		} else if (cheeseQuantity == 0) {
			System.out.println("              |           |                  |                  |");
		}
		if (veggieQuantity > 0) {
			System.out.println("Veggie pizza  | " +  veggieQuantity + "         | $15" + "              | $" + veggieTotalCost + "              |");
		} else if (veggieQuantity == 0) {
			System.out.println("              |           |                  |                  |");
		}
		if (meatQuantity > 0) {
			 System.out.println("Meat pizza"+ meatQuantity+ "$17"+ "$"+ meatTotalCost);
		} else if (meatQuantity == 0) {
			System.out.println("              |           |                  |                  |");
		}
		System.out.println("              |           |                  |                  |");
		System.out.println("              |           |                  |                  |");
		if (taxTotal %2 == 1 || taxTotal %2 == 0) {
			System.out.println("Sales Tax     |           | 6%               | $" + taxTotal + "            |");
		} else {
			System.out.println("Sales Tax     |           | 6%               | $" + taxTotal);
		}
		System.out.println("              |           |                  |                  |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Due                                    | $" + totalDue + "           |");
	}
		
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}