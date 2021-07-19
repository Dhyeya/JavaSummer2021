
public class AddressBook {
	public static void main(String[] args) {
		
		
		Contact[] contacts = new Contact[2];
		
		contacts[0] = new Contact();
		contacts[0].setFirstName("Dhruv");
		contacts[0].setLastName("Pisal");
		contacts[0].setEmailId("mailer142@gmail.com");
		contacts[0].setCellPhoneNumber("571-578-5781");
		contacts[0].setHomePhoneNumber("703-142-1234");
		contacts[0].setWorkPhoneNumber("877-132-1232");
		contacts[0].setAddress("51423, Wall Street, New York City, NY");
		contacts[0].setNotes("No additional notes.");
		
		contacts[1] = new Contact();
		contacts[1].setFirstName("Avy");
		contacts[1].setLastName("Garothaya");
		contacts[1].setEmailId("mailer767@gmail.com");
		contacts[1].setCellPhoneNumber("703-132-1233");
		contacts[1].setHomePhoneNumber("571-321-3124");
		contacts[1].setWorkPhoneNumber("877-142-1523");
		contacts[1].setAddress("13212, Wall Street, New York City, NY");
		contacts[1].setNotes("No additional notes.");
	
		String userContact = ReadUserInput.readUserStringInputLine("Enter name of person:");
		
		System.out.println("");
		
		int contactCounter = 0;
		boolean personFound = false;
		
		for(contactCounter = 0; contactCounter < contacts.length; contactCounter++) {
			String contactFullName = contacts[contactCounter].contactFirstName + " " + contacts[contactCounter].contactLastName;
			
			if(userContact.equalsIgnoreCase(contactFullName)) {
				personFound = true;
				System.out.println("Person found!");
				contacts[contactCounter].printDetails();
				break;
			} 
		}
		
		if(personFound == false) {
			System.out.println("Sorry, this person doesn't exist.");
		}
		
	}
}
