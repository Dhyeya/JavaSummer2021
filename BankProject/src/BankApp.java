
public class BankApp {
	public static void main(String[] args) {
		// Account #1
		Account accOne = new Account();
		accOne.setAccountNumber(1034);
		accOne.setName("Dhyeya Chandi");
		accOne.setAccountType('S');
		accOne.deposit(500);
		accOne.withdraw(204);
		
		accOne.printActivities();
	
		// Account #2
		Account accTwo = new Account();
		accTwo.setAccountNumber(3021);
		accTwo.setName("Avy Garothaya");
		accTwo.setAccountType('S');
		accTwo.deposit(709);
		accTwo.deposit(432);
		
		accTwo.printActivities();
		
		// Account #3
		Account accThree = new Account();
		accThree.setAccountNumber(4526);
		accThree.setName("Kartikeya Vinaykumar");
		accThree.setAccountType('S');
		accThree.deposit(602);
		accThree.withdraw(44);
				
		accThree.printActivities();
		
		// Account #4
		Account accFour = new Account();
		accFour.setAccountNumber(5813);
		accFour.setName("Dhruv Pisal");
		accFour.setAccountType('S');
		accFour.deposit(982);
		accFour.deposit(42);
		accFour.withdraw(66);
		accFour.withdraw(50);
				
		accFour.printActivities();
		
		// Account #5
		Account accFive = new Account();
		accFive.setAccountNumber(9821);
		accFive.setName("Oreo Garothaya");
		accFive.setAccountType('S');
		accFive.deposit(1000);
		accFive.withdraw(455);
		accFive.deposit(500);
				
		accFive.printActivities();
				
		
	}
}
