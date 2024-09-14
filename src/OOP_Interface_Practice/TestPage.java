package OOP_Interface_Practice;

public class TestPage {

	
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.boldLogo();
		lp.commonPage();
		lp.headerBold();
		lp.footerNavigationButton();
		lp.leftHeadings();
		lp.username();
		lp.password();
		LoginPage.submitButton();
		WebPage.nextButton();
		
		System.out.println("==================================================");
		
		HomePage hp = new HomePage();
		hp.boldLogo();
		hp.commonPage();
		hp.leftHeadings();
		hp.productoptions();
		hp.rateChart();
		HomePage.couponCode();
		
		System.out.println("==================================================");
		
		WebPage wb = new LoginPage();
		wb.boldLogo();
		wb.commonPage();
		wb.leftHeadings();
		int fontView = wb.fontSize;
		System.out.println(fontView);
	}
}
