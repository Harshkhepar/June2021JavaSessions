package javasessions;

public class Chain {

	public static void main(String a[]) {
		Chain c = new Chain();
		c.m1();
		Chain.t1();
	}

	public void m1() // non-static methods can call non-static and static methods
	{
		m2();
		Chain.t1();
		Chain.t2();
		t1();
	}

	public void m2() {
		System.out.println("m2 method");

	}

	public static void t1() {
		t2();// we can call static method directly bcoz they share common memory allocation or meta space
	}

	public static void t2() {
		System.out.println("t2 method");
		//m2();// non-static methods cannot be called directly from static methods.. we have to create the object
	}
}
