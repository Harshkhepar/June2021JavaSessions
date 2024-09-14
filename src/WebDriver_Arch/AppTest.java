 package WebDriver_Arch;

public class AppTest {

	public static void main(String[] args) {

		WebDriver driver = null;// we can create the reference of interface and initially it is null

		String browser = "chrome";

		//cross browser testing -- top casting
//		if (browser.equals("chrome")) {
//			driver = new ChromeDriver();// topcasting WebDriver refrence represent child class object
//		} else if (browser.equals("firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browser.equals("safari")) {
//			driver = new SafariDriver();
//		} else {
//			System.out.println("no browser found....");
//		}
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
	    case "firefox":
		driver = new FirefoxDriver();
		break;
	    case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Browser----NOTFOUND");
			break;
	}

		driver.get("http://www.xyz.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getUrl());
		driver.click();
		driver.sendKeys("admin@gmail.com");
		driver.quit();

	}

}