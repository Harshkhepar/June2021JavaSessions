package PracticeSessions;

public class ATMEn {
	public String screen;
	private int cash;
	private int pin;

	public ATMEn(String screen, int cash, int pin) {

		this.screen = screen;
		this.cash = cash;
		this.pin = pin;
	}

	public String getScreen() {
		return screen;
	}

	public int getCash() {
		return cash;
	}

	public int getPin() {
		return pin;
	}

	public void cardswap() {
		System.out.println("swap the ATM card for withdrawal");
       atmcard();
	}

	private void atmcard() {
        System.out.println("User is using atmcard for withrawal");
	}
	
	
	// now we have to give public layer on these private variables.

}
