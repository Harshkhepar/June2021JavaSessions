package javasessions;

public class CarBooking {
	    //1.function -> business logic //features 
		//2.Constructor: template of the class: used to initialize the class vars
	    //3.we can never write businesss logic inside the constructor
		
		String carType;
		String from;
		String to;
		int code;
		
		public void booking() {
			System.out.println("car is booked with : " + carType +" "+ from +" "+ to);
		}
		
		public CarBooking() {//default const... 0 param
			System.out.println("car booking is called....");
		}

		public CarBooking(String carType, String from, String to) {
			this.carType = carType;
			this.from = from;
			this.to = to;
		}

		public CarBooking(String from, String to) {
			this.from = from;
			this.to = to;
		}

		public CarBooking(String carType, String from, String to, int code) {
			this.carType = carType;
			this.from = from;
			this.to = to;
			this.code = code;
		}
}
