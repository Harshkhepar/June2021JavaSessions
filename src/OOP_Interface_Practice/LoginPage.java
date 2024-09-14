package OOP_Interface_Practice;

public class LoginPage implements WebPage,MobilePage {

	@Override
	public void headerBold() {
      System.out.println("LP------headerBold ");
		
	}

	@Override
	public void footerNavigationButton() {
		System.out.println("LP------footerNavigationButton ");
		
	}

	@Override
	public void boldLogo() {
		System.out.println("LP------boldLogo ");
		
	}

	@Override
	public void leftHeadings() {
		System.out.println("LP------leftHeadings ");
		
	}

	@Override
	public void commonPage() {
		System.out.println("LP------commonPage ");
		
	}
       public void username() {
    	   System.out.println("LP------username");
       }
	 
       public void password() {
    	   System.out.println("LP------password");
       }
       
       public static void submitButton() {
    	   System.out.println("LP-----------------submitButton");
       }
	
}
