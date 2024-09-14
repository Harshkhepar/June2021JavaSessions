package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {
		m2();
	}

	public void m2() {
		try {
			m3();// we can call method in other method: concept called - Method Chaining
		} catch (ArithmeticException e) {

		}
	}

	public void m3() throws ArithmeticException
	// here m3() method says fine i am giving the exception but i am not handling it...so i am throwing it
	{
		int i = 9 / 0;
		System.out.println("hi");
	} 

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("bye");
	}
     // 1. stack trace is maintained by LIFO(Last In first Out) Data structure or stack data structure
	// always read stacktrace from bottom to top of the exception
	 // 2. JVM will never handle the exception
	// 3. throws keyword is not used to handle the exception
	// 4. Good practice is that where exactly the exception is coming that method have to resolved the exception
	// not throwing it to other methods.
	//5. Throwable class(Parent class)-- of Exception class and Error class(sibling class or child class of throwable class)
	//-- is the parent class of all the exceptions
	// 6.Exception is common so we use  mostly Exception(in case we don't know the exception)
	// 7.with Error class we can't handle the exception
}
