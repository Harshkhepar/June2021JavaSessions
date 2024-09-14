package FinalizeMethod;

public class Flipkart{
	
	String name = "flipkart";
	
	@Override
	public void finalize() {
		System.out.println("this is flipkart finalize method....");
	}
	
	// If Flipkart extends Amazon then Amazon Finalize method can be called----due to inheritance

}