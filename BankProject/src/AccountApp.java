
public class AccountApp {
	public static void main(String[] args) {
		Customer newCustomer = new Customer();
		newCustomer.setName("Dhyeya Chandi");
		newCustomer.setBirthDate("11/02/2007");
		newCustomer.setSsn(132124213);
		newCustomer.setPhoneNum("571-571-5715");
		newCustomer.setStreetAddress("51321, Wall Street");
		newCustomer.setCity("New York City");
		newCustomer.setState("New York");
		newCustomer.setZipCode("10005");
		
		newCustomer.addAccount('C', 4012, 100);
		
		newCustomer.addAccount('S', 5123, 230);
		
		newCustomer.addAccount('C', 1231, 320);
		newCustomer.printStatements();
		
		
	}
	
}
