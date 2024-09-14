package javasessions;

public class MainMethodOverloading {

	public static void main(int b) {
		System.out.println("value of b" + b);
	}
	
	public static void main(int b, int c) {
		System.out.println("values:  " + b + " " + c);
	}
	
	public static void main(String a[]) { // JVM always check the exact parameter for main method
		System.out.println("Start the program");
		
		MainMethodOverloading.main(10);
		
	}

}
// 1.main method can be overloaded  -- but in real time we doesn't use this
// but jvm will always check the systematic syntax of main method i.e public static void main(String a[])
// 2.we not need to create the object for static method
  // className.staticmethodName -- calling static method 	