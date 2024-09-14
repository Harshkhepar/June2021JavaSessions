package OOP_Interface_Practice;

public class HomePage implements WebPage {

	@Override
	public void boldLogo() {
     System.out.println("HP------boldLogo");
		
	}

	@Override
	public void leftHeadings() {
		System.out.println("HP------leftHeadings");
		
	}

//	@Override  -- we can't make override here bcoz this method is also present in MobilePage Interface
	public void commonPage() {
		System.out.println("HP------commonPage");
		 
	}
     
	public void productoptions() {
		System.out.println("Hp-------productoptions");
	}
	public void rateChart() {
		System.out.println("Hp-------rateChart");
	}
	
	public static void couponCode() {
		System.out.println("Hp-------couponCode");
	}

	
}
