
public class PetApp {
	public static void main(String[] args) {
		Pet Oreo = new Pet();
		Oreo.setPetType("Dog");
		Oreo.setPetName("Oreo");
		Oreo.setBreed("Bichon Poodle");
		Oreo.setAge("9 months");
		Oreo.setColor("Light brown");
		Oreo.setBarks("does");
		
		Oreo.printPetInfo();
	}
}
