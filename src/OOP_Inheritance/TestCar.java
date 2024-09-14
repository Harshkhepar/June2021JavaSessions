package OOP_Inheritance;

public class TestCar {
public static void main(String[] args) {
		
		final int i = 10;//constant variable
		
		final int days = 7;
		System.out.println(days * 100);

		BMW b = new BMW();
		b.start();//overriden
		b.stop();//inherited from P
		b.refuel();//inherited
		b.autoParking();//Individual
		b.engine();//inherited from GP
	//	b.airBags();// inherited from Parent(basically it is overriden by car from vehicle) --- preference given to immediate parent 
		//when this method is not present in BMW class
		b.airBags();// this is a BMW method now 
		System.out.println(b.price);// we can access the variable also
		
		BMW.testing();
		Car.testing();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

		//top/up casting:
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking();//-->ref type check
		
		//child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.airBags();
		v1.engine();
		

		//down casting: parent class object can be referred by child class ref varibale
		BMW b1 = (BMW)new Car();// no error at compile time but we run it gives you 
		//ClassCastException at run time
		// socho -- hum kisi car ko BMW aese he bna sakte hai ---bna denge uska logo lgake 
		// but vo jab chalegi tab toh vo vese he khatara hogi na
		//BMW b2 = (BMW)new Vehicle();
		
	}

}




