package PracticeSessions;

public class TestATM {

	public static void main(String[] args) {
		ATMEn atm = new ATMEn("HD", 10000, 9331);
	//	atm.setCash(20000);
		System.out.println(atm.getCash());
		
	//	atm.setPin(9331);
		System.out.println(atm.getPin());
		
		System.out.println(atm.screen);
		
		atm.cardswap();
	}

}
