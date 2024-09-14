package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.logo();
		lp.pageUrl();
		lp.header();
		lp.title();
		lp.forogotPwd();
		lp.doLogin("admin", "admin");
		Page.bussiness();
		LoginPage.bussiness();
		
		
		//Page p = new Page();// Not allowed as Page is abstract class
		//top casting: child class object can be 
		//referred by abstract parent class ref variable
		// with parent class refrence you can access only parent class methods not the individual child class methods
		Page p = new LoginPage();
		p.title();
		p.header();
		p.logo();
		p.pageUrl();
		
		//down casting: Not Allowed-- bcoz Page class object can't be created
		
		// for constructors: always parent class constructor is called first
	}

}