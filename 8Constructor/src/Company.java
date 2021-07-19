
public class Company {
	public static void main(String[] args) {
		Employee[] employees;

		employees = new Employee[10];
		
		employees[0] = new Employee();
		employees[0].setName("Ben Dover");
		employees[0].setAge(39);
		employees[0].setDesignation("Systems Analyst");
		employees[0].setSalary(97000);

		employees[1] = new Employee();
		employees[1].setName("Jack Grey");
		employees[1].setAge(27);
		employees[1].setDesignation("Programmer");
		employees[1].setSalary(86000);

		employees[2] = new Employee();
		employees[2].setName("Jim Rogers");
		employees[2].setAge(43);
		employees[2].setDesignation("Systems Analyst");
		employees[2].setSalary(91000);

		employees[3] = new Employee();
		employees[3].setName("Katherine Davis");
		employees[3].setAge(32);
		employees[3].setDesignation("Database Administrator");
		employees[3].setSalary(109000);

		employees[4] = new Employee();
		employees[4].setName("Karen Williams");
		employees[4].setAge(43);
		employees[4].setDesignation("Programmer");
		employees[4].setSalary(76000);
		
		employees[5] = new Employee();
		employees[5].setName("Edgar Thompson");
		employees[5].setAge(24);
		employees[5].setDesignation("Systems Analyst");
		employees[5].setSalary(93400);
		
		employees[6] = new Employee();
		employees[6].setName("Alec Benjamin");
		employees[6].setAge(27);
		employees[6].setDesignation("Project Manager");
		employees[6].setSalary(89000);

		employees[7] = new Employee();
		employees[7].setName("Conan Gray");
		employees[7].setAge(22);
		employees[7].setDesignation("Programmer");
		employees[7].setSalary(94500);

		employees[8] = new Employee();
		employees[8].setName("Fred Miller");
		employees[8].setAge(35);
		employees[8].setDesignation("Systems Analyst");
		employees[8].setSalary(96700);

		employees[9] = new Employee();
		employees[9].setName("John Washington");
		employees[9].setAge(41);
		employees[9].setDesignation("Database Administator");
		employees[9].setSalary(105600);

		Employee employeeMax = employees[0];
		int personnelCount = 0;

		for (personnelCount = 0; personnelCount < 10; personnelCount++) {
			if (employees[personnelCount].salary > employeeMax.salary) {
				employeeMax = employees[personnelCount];
			}

		}
		employeeMax.printEmployeeDetails();

	}
}
