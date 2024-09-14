  package OOP_Abstract;

public abstract class Page {
	
	//1. In this class we can have abstract methods and non abstract methods
	//2. abst.. class object can not be created
	//khatarnak note >> 3.abst.. class constructor can be created
	// it will be called when you create the object of child class.
	// 4. In abstract class if you are defining a method without braces then you should write
	// abstract keyword unlike in interface.
	// 5. If any class extends Page class then abstract method should be override(it is compulsion)
	
	
	public Page() // constructor of abstract class is allowed
	{
		System.out.println("Page default const....launch app page");
	}
	
	public Page(int timeOut) {
		System.out.println("launch app within: " + timeOut);
	}
	
	//abst methods - 2
	//non abstract -- 3
	// public  void header(); --- not allowed 
	public abstract void header();
	public abstract void title();
	
	public void pageUrl() {
		System.out.println("http://www.xyz.com");
	}
	
	public final void logo()// can't override this method bcoz "final"
	{
		System.out.println("app logo");
	}

	public static void bussiness() {
		System.out.println("Page business");
	}
	

}