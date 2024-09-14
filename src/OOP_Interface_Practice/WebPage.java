package OOP_Interface_Practice;

public interface WebPage {
	
    int fontSize = 12;
	public void boldLogo();
	
	public void leftHeadings();
	
	public static void nextButton() {
		System.out.println("WebPage should have next Button");
	}
	
	public void commonPage();
	
}
