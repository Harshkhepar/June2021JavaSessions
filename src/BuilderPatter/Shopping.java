 package BuilderPatter;

public class Shopping {
	public static void main(String[] args) {

		EcommApp ecom = new EcommApp();

		// case1 --- This is called builder pattern --- not used in selenium (bcoz we r
		// not able to do assertion)
		ecom.login("naveen@gmail.com", "test123")// login return same object so we can do chaining
				.search("tshirts", "black").addToCart("tshirts").doPayment("121212@hdfc", 1234, "test123")
				.getOrderInfo().logout();

		// case2
		ecom.login("naveen@gmail.com", "test123").getOrderInfo().logout();

		// case3:
		ecom.login("naveen@gmail.com", "test123").search("Macbook").logout();

		// case4:
		ecom.login("naveen@gmail.com", "test123").logout();

		// case5:
		ecom.logout();

		// Builder Pattern:
        // 1. when we have no. of methods in an Application(Ecomm App) and each method
		// is returning the same class object only then we use builder pattern.
		// 2.Advantage:we can create number of work flows.
		// 3.Dis-adv  :it is not in readable format(chaining info)  
	}

}
