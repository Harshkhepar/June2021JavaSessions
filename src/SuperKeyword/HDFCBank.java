package SuperKeyword;

public class HDFCBank extends Bank {
	
	int min_bal = 200;// there is no concept of variable overriding in java
	// super statement should be the first line in your class.
	// super keyword representing parent class object : So with super keyword parent class k har chiz ko hum access kr sakte hai
	public HDFCBank(int a) {
		// if super (20) is not there then default constructor of super class(Bank) will be called
		super(20);// this we used to call parameterized constructors of parent class(Bank)
		// we can't write 2 super statement bcoz it should be the first line
	//	super("Naveen","Bangalore"); -- must be the first line
		System.out.println("this hdfc const...." + a);
	}
	
	// for calling both the constructor of parent class then we have to create separate constructor
	public HDFCBank(String name, String branchName) {
		super(name, branchName);
	}
	
	

	public void balanceDisplay() {
		System.out.println("HDFCBank -- balance display");
		System.out.println(min_bal);// 200
		
		// now I want to display bank min bal. when calling in TestBank class,for this need not to create unnecessary Bank class object
		// In this case we use super keyword.
		// super keyword pointing to the parent class object
		System.out.println(super.min_bal);
		super.balanceDisplay();// calling parent class method from Bank class
		super.account();// super can access parent class static method also
		Bank.account();
		System.out.println(super.min_age);
		System.out.println(Bank.min_age);
	}

}