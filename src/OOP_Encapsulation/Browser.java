package OOP_Encapsulation;

public class Browser {
	// How we can achieve encapsulation without getters and setter
	
	// private methods
		// will be accessed via public methods
      // dekho agar hum browser class ka object bnate hai toh usme ye sare methods aaenge then ye sare methods ek dusre ko call kr
	// sakte hai
	
//	public static void main(String a[]) {
//		Browser br = new Browser();
//		br.launchBrowser();
//		Here user have access to all the methods... user ko kya need hai iss chiz ki toh usko ye access kyu dena
	// user ko matlab end result se isliye hum alag se class bnakr iss class k object ko bnate hai
//	}
	
	
	
		public void launchBrowser() // this is also encapsulation not only getter and setter can achieve encaps..
		// in this what we do, humne public method mai sare private methods define kr diye within same class ye allowed hai toh
		// ab hum ye public method kisi b main method mai use kr sakte hai : toh ye b ek tarika hua encapsulation ka
		{
			System.out.println("trying to launch browser...");
			isChromePresent();
			checkRAMSpace();
			browserIsUpgraded();
			checkOSCompatible();
			checkBrowserVersion();
			System.out.println("browser is launched...");

		}

		private void isChromePresent() {
			System.out.println("isChromePresent");
		}

		private void checkRAMSpace() {
			System.out.println("checkRAMSpace");

		}

		private void browserIsUpgraded() {
			System.out.println("browserIsUpgraded");

		}

		private void checkOSCompatible() {
			System.out.println("checkOSCompatible");

		}

		private void checkBrowserVersion() {
			System.out.println("checkBrowserVersion");

		}
}
