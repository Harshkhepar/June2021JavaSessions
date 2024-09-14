package OOP_Inheritance;

public class BMW extends Car{
	
	
	int price = 500;
	
	//Method Overriding: when we have method in parent class as well as in child class
	//with the same name 
	//and same number of parameters
	//and same return type
	//Run Time/Dynamic Polymorphism
	
	//static method can not be overriden --- bcoz static method cannot be a part of object then 
	// how can you say that by creating the object of BMW we can override static method of Car class.
	// static method is in CMA- common memory allocation

	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
	//Method Hiding  --- only for static methods >> thus method is also in Car class
	public static void testing() {
		System.out.println("BMW -- testing");
	}
	
	@Override
	public void airBags() {
		System.out.println("BMW -- airBags");
	}
	
	private void fuel() {
		System.out.println("Car -- fuel");
	}
	

}