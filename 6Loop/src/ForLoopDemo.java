
public class ForLoopDemo {
	public static void main(String[] args) {
		/*int index = 10;
		
		for (index = 10; index >= 1; --index) {
			System.out.println(index);
		}*/
		
		String names[] = new String[5];
		names[0] = "Dhyeya-0";
		names[1] = "Dhyeya-1";
		names[2] = "Dhyeya-2";
		names[3] = "Dhyeya-3";
		names[4] = "Dhyeya-4";
		
		/*System.out.println("Array Length: " + names.length);
		for(int index = 0; index < 4; index++) {
			System.out.println(names[index]);
		}*/
		
		for(String name : names) {
			System.out.println(name);
		}
		
		int numbers[] = new int[4];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 2;
		numbers[3] = 3;
		int sum = 0;
		
		for(int number : numbers) {
			sum = sum + number;
		}
		
		System.out.println("The sum is " + sum);
	}
}
