
public class HW7_8 {
	public static void main(String[] args) {
		int myNum = 25;
		
		for(myNum = 25; myNum <= 2000 ; myNum++) {
			if(isPrime(myNum) == true) {
				System.out.println(myNum);
			}
		}
	}
	
	public static boolean isPrime(int checkNum) {
		int divisCounter = 2;
		for(divisCounter = 2; divisCounter < checkNum; divisCounter++) {
			if(checkNum % divisCounter == 0) {
				return false;
			} 
			 
		}
		
		return true;
	}
}
