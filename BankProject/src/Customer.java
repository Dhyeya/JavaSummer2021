
public class Customer {
	private String name;
	private String birthDate;
	private int ssn;
	private String phoneNum;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	
	Account[] accounts = new Account[25];
	int accountCount = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void addAccount(char accountType, long accountNumber, float startingBalance) {
		Account newAccount = new Account();
		newAccount.deposit(startingBalance);
		newAccount.setAccountType(accountType);
		newAccount.setAccountNumber(accountNumber);
		newAccount.setName(name);
		accounts[accountCount++] = newAccount;
	}
	
	public void printStatements() {
		int index = 0;
		for(index = 0; index < accountCount; index++) {
			accounts[index].printActivities();
		}
	}
	
	
}
