package Superpackage;

public class BMW extends Car {
	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.name);
		//System.out.println(c1.price);// private variable in sub class not accessible
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		BMW b1 = new BMW();
		
		
	}
}
