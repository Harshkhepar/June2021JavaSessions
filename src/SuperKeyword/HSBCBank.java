  package SuperKeyword;

public class HSBCBank {

	String name;
	String city;

	public HSBCBank() {
		this("hsbc insurance", "pune");//-- this can points to second constructor
		System.out.println("default hsbc....");
	}

	public HSBCBank(String name, String city) {
		// super() keyword pointing parent class object
		// this() keyword always point current class object

	    // this();-- this will direct to current class constructor(default constr.)
		this.name = name;
		this.city = city;
	}
	
	public void display() {
//		this.name = "HSBC";
//		this.city = "Pune";
		System.out.println(name + city);
	}

}