package javasessions;

public class PersonTest {

	public static void main(String[] args) {
		
//		Persons p1 = new Persons();// here default constructor with 0 param is called 	
//		p1.name="Tom";
//		p1.city="NY";
//		p1.age= 25;
//		
//		Persons p2 = new Persons();
//		p2.name="khuram";
//		p2.city="LA";
//		p2.age= 29;
		
		// 1>> suppose we hv to create 1000 objects, i need to repeat the above code-- now for this 
		// we have to create the constructors  

		Persons p1 = new Persons("Tom", 20);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.city);
		
		Persons p2 = new Persons("Peter", 25, "NY");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.city);
		
		CarBooking b1 = new CarBooking("sedan", "bangalore", "pune");
		b1.booking();// calling the method of CarBooking class
		
		CarBooking b2 = new CarBooking();
		b2.booking();
		
		CarBooking b3 = new CarBooking("mini", "dest1", "dest2");
		b3.booking();
	}
}
