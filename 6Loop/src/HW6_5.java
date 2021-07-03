
public class HW6_5 {
	public static void main(String[] args) {
		
		int numbers[] = new int[4];
		numbers[0] = ReadUserInput.readUserIntegerInput("Enter 1st number:");
		numbers[1] = ReadUserInput.readUserIntegerInput("Enter 2nd number:");
		numbers[2] = ReadUserInput.readUserIntegerInput("Enter 3rd number:");
		numbers[3] = ReadUserInput.readUserIntegerInput("Enter 4th number:");
		int index = 0;
		int numbermin = numbers[0];
		
		
		
		for(index = 0; index < numbers.length ; index++) {
			if(numbers[index] < numbermin) {
				numbermin = numbers[index];
			}
		}
		System.out.println(numbermin);
	}
}
