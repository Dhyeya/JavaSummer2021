
public class HW6_4 {
	public static void main(String[] args) {
		int numbers[] = new int[12];
		numbers[0] = 6123;
		numbers[1] = 43123123;
		numbers[2] = 21232124;
		numbers[3] = 7123213;
		numbers[4] = 5213213;
		numbers[5] = 812321;
		numbers[6] = 3123123;
		numbers[7] = 112323512;
		numbers[8] = 21012341;
		numbers[9] = 676769;
		numbers[10] = 92903223;
		numbers[11] = 898660102;
		
		int index = 0;
		int numbermax = numbers[0];
		
		for(index = 0; index < numbers.length ; index++) {
			if(numbers[index] > numbermax) {
				numbermax = numbers[index];
			}
		}
		// Print max number in array
		System.out.println("The max number in the array is " + numbermax);
	}
}
