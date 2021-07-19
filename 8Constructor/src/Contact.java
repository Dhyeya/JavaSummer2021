
public class Contact {
	public String contactFirstName;
	public String contactLastName;
	public String emailId;
	public String cellPhoneNumber;
	public String homePhoneNumber;
	public String workPhoneNumber;
	public String address;
	public String notes;
	
	public String getFirstName() {
		return contactFirstName;
	}
	public void setFirstName(String firstName) {
		this.contactFirstName = firstName;
	}
	public String getLastName() {
		return contactLastName;
	}
	public void setLastName(String lastName) {
		this.contactLastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	public String getWorkPhoneNumber() {
		return workPhoneNumber;
	}
	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public void printDetails() {
		System.out.println("Name: " + contactFirstName + " " + contactLastName);
		System.out.println("Email address: " + emailId);
		System.out.println("Cellphone #: " + cellPhoneNumber);
		System.out.println("Home phone #: " + homePhoneNumber);
		System.out.println("Work phone #: " + workPhoneNumber);
		System.out.println("Address: " + address);
		System.out.println("Notes: " + notes);
		System.out.println("");
	}
}
