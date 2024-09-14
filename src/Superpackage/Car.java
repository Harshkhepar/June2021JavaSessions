 package Superpackage;
 // Table in videos
public class Car {
	public String name = "BMW";
	private int price = 50;
	protected String color = "Red";
	String model = "x1";

	public void m1() {
	//	protected String tube = "donut"; within the method we never use access modifiers
	}
	
	private void m2() {
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		String test = "Red";
        
//		protected String color = "Red";// within the method we never use access modifiers

	}
//	Ques: why main method is public in nature?
//  Ans : Because if we made it private or protected jvm will never access it

}
