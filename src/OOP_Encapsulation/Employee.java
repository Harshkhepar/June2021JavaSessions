package OOP_Encapsulation;

//Encapsulation : means suppose you have private variables in your class and we create one public methods 
//over it by Getters and setters and whenever we have to call these private variables then 
// we will calling getter and setter and these getter and setter will call these private variables.
// eg. laptop : motherboard,IC(private property) are hided and over that keyboard and monitor(getter and setter)
// eg. ATM machine
public class Employee {
	public String name;
	private double salary;// this we can't access in TestEmp bcoz it is private but if we create main
							// method in this class then we can access this salary							
	private double shares;

	public Employee(String name, double salary, double shares)// we don't need setters now bcoz this is done by constructor 
	{
		this.name = name;
		this.salary = salary;
		this.shares = shares;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getShares() {
		return shares;
	}

	public void setShares(double shares) {
		this.shares = shares;
	}
}
