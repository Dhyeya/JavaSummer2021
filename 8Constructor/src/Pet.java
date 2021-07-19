
public class Pet {
	String petType;
	String petName;
	String breed;
	String age;
	String color;
	String barks;
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public String getPetType() {
		return petType;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setBarks(String barks) {
		this.barks = barks;
	}
	
	public String getBarks() {
		return barks;
	}
	
	public void printPetInfo() {
		System.out.println("Type: " + petType);
		System.out.println("Name: " + petName);
		System.out.println("Breed: " + breed);
		System.out.println("Age: " + age);
		System.out.println("Color: " + color);
		System.out.println("This pet " + barks + " bark.");
		
	}
}
