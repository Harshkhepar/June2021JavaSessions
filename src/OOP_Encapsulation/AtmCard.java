package OOP_Encapsulation;

public class AtmCard {
      public String customerName;
      private int cvvNumbver;
      private int pinCode;
      
      
	public AtmCard(String customerName,int cvvNumbver,int pinCode) {
		this.customerName = customerName;
		this.cvvNumbver = cvvNumbver;
		this.pinCode = pinCode;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getCvvNumbver() {
		return cvvNumbver;
	}
	public void setCvvNumbver(int cvvNumbver) {
		this.cvvNumbver = cvvNumbver;
	}
      
}

