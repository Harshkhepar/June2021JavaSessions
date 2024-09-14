package OOP_Inheritance;

public class Car extends Vehicle {

	int price = 100;

	// final keyword: 1.to prevent method overriding
	//                2.to prevent inheritance
	//                3.if a car is declare with final it cannot be a parent.

	private void fuel() // private methods cannot be Overriden
	{
		System.out.println("Car -- fuel");
	}

	public static void testing() {
		System.out.println("car -- testing");
	}

	public void start() {
		System.out.println("Car -- start");
	}
	
//	public final void  start() {
//		System.out.println("Car -- start");
//	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}

	@Override
	public void airBags() {
		System.out.println("car -- airBags");

	}
	// 1.Java doesn't support multiple inheritance or diamond problem --like Truck class
	//  cannot be extended by car class(already extending vehicle class)
	// 2.Diamond problem or multiple inheritance can be achieved by interface
	// 3.Multi-level inheritance can be achieved.

}
