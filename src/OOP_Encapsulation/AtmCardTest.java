 package OOP_Encapsulation;

public class AtmCardTest {
	
	public static void main(String[] args) {
		AtmCard atmTest = new AtmCard("Harsh",290,1999);
		
		System.out.println(atmTest.customerName + " "+ atmTest.getCvvNumbver() + " " + atmTest.getPinCode());
		
		
	}
	
}
