package Interface_AbstractClass_Practice;

public class Ola implements BookingCar{
     
	public Ola() {
		System.out.println("Ola----default constr");
	}
	
	@Override
	public void airBags() {
		System.out.println("Car should have atleast 6 airbags");
		
	}

	@Override
	public void carDetails() {
		System.out.println("CarDetails for ola should be Bold and in capital letter");
		
	}

	@Override
	public void pickUpTime() {
		System.out.println("pickup time of customer should be mentioned");
		
	}

	@Override
	public void droppingTime() {
		System.out.println("drop time should be displayed on customer ola app");
		
	}

}
