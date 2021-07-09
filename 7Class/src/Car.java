//Create a class Car with following attributes
public class Car {
	//Make attribute
	String make;

	public void setMake(String make) {
		 this.make = make;
	 }
	
	public String getMake() {
		return make;
	}
	 
	 //Model attribute
	 String model;
	 
	 public void setModel(String model) {
		 this.model = model;
	 }
	 
	 public String getModel() {
		 return model;
	 }
	 
	 //Year attribute
	 int year;
	 
	 public void setYear(int year) {
		 this.year = year;
	 }
	 
	 public int getYear() {
		 return year;
	 }
	 
	 //NewOld attribute
	 String newOld;
	 
	 public void setNewOld(String newOld) {
		 this.newOld = newOld;
	 }
	 
	 public String getNewOld() {
		 return newOld;
	 }
	 
	 //Price attribute
	 public int price;
	 
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 
	 public int getPrice() {
		 return price;
	 }
	 
	 //Mileage attribute
	 public int mileage;
	 
	 public void setMileage(int mileage) {
		 this.mileage = mileage;
	 }
	 
	 public int getMileage() {
		 return mileage;
	 }
	 
	 //MPG attribute
	 public int mpg;
	 
	 public void setMpg(int mpg) {
		 this.mpg = mpg;
	 }
	 
	 public int getMpg() {
		 return mpg;
	 }
	 
	 public void printDetails() {
		 System.out.println("Make: " + make);
		 System.out.println("Model: " + model);
		 System.out.println("Year: " + year);
		 System.out.println("This car is " + newOld);
		 System.out.println("Price of the car");
		 System.out.println("The car's mileage is " + mileage);
		 System.out.println("The car's miles per gallon are " + mpg);
		 System.out.println("");
	 }
}
