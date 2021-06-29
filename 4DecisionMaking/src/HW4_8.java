import java.util.Scanner;

public class HW4_8 {

	int CHEESE_PIZZA_COST = 10;
	int VEGGIE_PIZZA_COST = 15;
	int MEAT_LOVER_PIZZA_COST = 17;
	
	int STATE_TAX_PERCENTAGE = 6;
	
	public static void main(String[] args) {		
		
		int cheeseQuantity = readUserIntegerInput("Enter amount of cheese pizzas:");
		int veggieQuantity = readUserIntegerInput("Enter amount of veggie pizzas");
		int meatQuantity = readUserIntegerInput("Enter amount of meat pizzas:");
		
		int cheeseTotalCost = cheeseQuantity*10;
		int veggieTotalCost = veggieQuantity*15;
		int meatTotalCost = meatQuantity*17;
		
		int totalCost = cheeseTotalCost + veggieTotalCost + meatTotalCost;
		
		double taxTotal = (cheeseTotalCost + veggieTotalCost + meatTotalCost)*0.06;
		
		double totalDue = totalCost + taxTotal;
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Item          | Quantity  | Price per Item   |  Total   |");
		System.out.println("---------------------------------------------------------");
		System.out.println("Cheese pizza  | " + cheeseQuantity + "         | $10" + "              | $" + cheeseTotalCost + "      |");
		System.out.println("Veggie pizza  | " +  veggieQuantity + "         | $15" + "              | $" + veggieTotalCost + "      |");
		System.out.println("Meat pizza    | " + meatQuantity + "         | $17" + "              | $" + meatTotalCost + "      |");
		System.out.println("              |           |                  |          |");
		System.out.println("              |           |                  |          |");
		System.out.println("Sales Tax     |           | 6%               | $" + taxTotal + "    |");
		System.out.println("              |           |                  |          |");
		System.out.println("---------------------------------------------------------");
		System.out.println("Total                                        | " + totalDue + "    |");
	}
		
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}