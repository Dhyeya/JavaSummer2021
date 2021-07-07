// Create a CarApp class, define 3 cars.
public class CarApp {
	public static void main(String[] args) {
		Car Mustang = new Car();
		Mustang.make = "Ford";
		Mustang.model = "Boss 429 Mustang";
		Mustang.year = 1969;
		Mustang.newOld = "old";
		Mustang.price = 50000;
		Mustang.mileage = 60;
		Mustang.mpg = 5;
		
		Mustang.printDetails();
		
		Car Taycan = new Car();
		Taycan.make = "Porsche";
		Taycan.model = "Taycan Turbo S";
		Taycan.year = 2020;
		Taycan.newOld = "new";
		Taycan.price = 105000;
		Taycan.mileage = 70;
		Taycan.mpg = 9;
		
		Taycan.printDetails();
		
		Car Supra = new Car();
		Supra.make = "Toyota";
		Supra.model = "Supra GR";
		Supra.year = 2020;
		Supra.newOld = "new";
		Supra.price = 50000;
		Supra.mileage = 30;
		Supra.mpg = 15;
		
		Supra.printDetails();
		
	}
}
