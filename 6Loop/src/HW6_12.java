 
public class HW6_12 {
	public static void main(String[] args) {

		int index = 0;
		int currentNum = 0;
		int var1 = 0;
		int var2 = 1;
		String values = "0, 1, ";
		
		for(index = 0; index < 8; index++) {
			currentNum = var1+var2;
			var1 = var2;
			var2 = currentNum;
			if(index == 7) {
				values = values + Integer.toString(currentNum);
			} else {
				values = values + Integer.toString(currentNum) + ", ";
			}
		}
		System.out.print(values);
	}
}
