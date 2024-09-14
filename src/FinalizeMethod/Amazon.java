package FinalizeMethod;

public class Amazon {
	
	//final: is a keyword
	//1. Constant values
	//2. to prevent the inheritance
	//3. to prevent method overriding
	
	//2. finally: is a block
	
	//3. finalize(): is a method (overridden from Object class) upto 1.8
	
	
	String name;

	public static void main(String[] args) {

		Amazon a = new Amazon();
		a = null; // finalize method is called with respective class objects
		
		Flipkart f = new Flipkart(); 
		f = null; // here if flipkart does not have finalize method then no finalize method will be called by gc
		
		//requesting JVM to call GC:
		System.gc();// gc() will always see before cleaning is there any finalize method 
		            // then they will perform their action
		System.out.println("Bye....");
		
	}
	
	@Override // override from object class
	public void finalize() 
	// we need not to call this method in main method with object reference-- automatically it is called.
	{
		System.out.println("this is Amazon finalize method....");
	}
	// no use case of finalize in selenium
	// After jdk 1.9 this method is removed and cleaner class is introduced

}