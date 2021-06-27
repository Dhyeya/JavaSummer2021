
public class ConditionalOperators {
	public static void main (String[] arg) {
		int num1 = 10;
		int num2 = 20;
		
		int max = 0;
		
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		
		max = (num1 > num2) ? num1: num2;
		
		System.out.println(max);
	}
}
