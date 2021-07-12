import java.util.Date;

public class AccountActivity {
	private Date txnDate;
	private float amount;
	private String action; // Credit/Debit
	private String description;
	private float runningBalance;

	public void setDate(Date activityDate) {
		txnDate = activityDate;
	}
	public Date getDate() {
		return txnDate;
	}
	public void setAmount(float activityAmount) {
		amount = activityAmount;
	}
	public float getAmount() {
		return amount;
	}
	
	public void setAction(String activityAction) {
		action = activityAction;
	}
	public String getAction() {
		return action;
	}
	public void setDescription(String activityDescription) {
		description = activityDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setRunningBalance(float activityRunningBalance) {
		runningBalance = activityRunningBalance;
	}
	public float getRunningBalance() {
		return runningBalance;
	}
}
