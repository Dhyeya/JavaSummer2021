
public class Employee {
	String employeeName;
	int age;
	String designation;
	double salary;
	
	public void setName(String name) {
		this.employeeName = name;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Name: " + employeeName);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: $" + salary);
	}
}	
