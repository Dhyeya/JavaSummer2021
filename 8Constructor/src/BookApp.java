
public class BookApp {
	public static void main(String[] args) {
		Book theGirlWhoWasSupposedToDie = new Book();
		theGirlWhoWasSupposedToDie.setTitle("The Girl Who Was Supposed to Die");
		theGirlWhoWasSupposedToDie.setNumberOfPages(213);
		theGirlWhoWasSupposedToDie.setAuthor("April Henry");
		theGirlWhoWasSupposedToDie.setYear(2013);
		theGirlWhoWasSupposedToDie.setCost(5.99);
		
		theGirlWhoWasSupposedToDie.printInfo();
	}
	
	
}
