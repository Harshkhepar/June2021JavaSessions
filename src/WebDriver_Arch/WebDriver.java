package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	public void get(String url);

	public String getTitle();

	public String getUrl();

	public void click();

	public void sendKeys(String value);

	public void quit();

}
// WebDriver should be interface or Abstract class?
// Ans: Interface. why not Abstract class because Abstract class may have some methods with method body or
// you can say non abstract methods  and then WebDriver have power to design some common methods and decide how browser will launch 
// thats not good thing let browser class have that power to decide.