import java.util.Date;

public class Account {

	// Define following fields in account class.
	private long accountNumber;
	private String name;
	private float balance = 0;
	private char accountType;

	private AccountActivity[] activities = new AccountActivity[25];
	private int activityCount = 0;

	// TODO: Implement following methods
	public void setAccountNumber(long newAccountNumber) {
		accountNumber = newAccountNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setAccountType(char newAccountType) {
		accountType = newAccountType;
	}

	public char getAccountType() {
		return accountType;
	}

	public void deposit(float aAmount) {
		AccountActivity depositActivity = new AccountActivity();
		depositActivity.setDate(new Date());
		depositActivity.setAmount(aAmount);
		float runningBalance = aAmount + balance;
		depositActivity.setRunningBalance(runningBalance);
		balance = runningBalance;
		depositActivity.setAction("Credit");
		depositActivity.setDescription("Cash Deposit   ");
		activities[activityCount++] = depositActivity;
	}
	
	public void withdraw(float withdrawAmount) {
		AccountActivity depositActivity = new AccountActivity();
		depositActivity.setDate(new Date());
		depositActivity.setAmount(withdrawAmount);
		float runningBalance = balance - withdrawAmount;
		depositActivity.setRunningBalance(runningBalance);
		balance = runningBalance;
		depositActivity.setAction("Debit ");
		depositActivity.setDescription("Cash Withdrawal");
		activities[activityCount++] = depositActivity;
	}

	public void printActivities() {
		int index = 0;
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("------------------------------------------------------------------------");
		System.out.println(" Date                        | Description     | Action | Amount | Running Balance |");
		System.out.println("------------------------------------------------------------------------");

		for(index = 0; index < activityCount; index++) {
			System.out.println(activities[index].getDate() + " | " + activities[index].getDescription() + " | " + activities[index].getAction() + " | "  + activities[index].getAmount() + " | " + activities[index].getRunningBalance() +" |");
		}
		
		System.out.println("------------------------------------------------------------------------");
	}

}