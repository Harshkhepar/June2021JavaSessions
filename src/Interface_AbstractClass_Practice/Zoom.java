package Interface_AbstractClass_Practice;

public class Zoom implements BookingCar {
	
	public Zoom() {
		System.out.println("Zoom----default constr");
	}
	
	@Override
	public void airBags() {
		System.out.println("Car should have atleast 2 airbags");
		
	}

	@Override
	public void carDetails() {
		System.out.println("CarDetails for Zoom should be Bold and in small letter");
		
	}

	@Override
	public void pickUpTime() {
		System.out.println("pickup time of customer should be mentioned");
		
	}

	@Override
	public void droppingTime() {
		System.out.println("drop time should be displayed on customer Zoom app");
		
	}

}
