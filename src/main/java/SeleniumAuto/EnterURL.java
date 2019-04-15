package SeleniumAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterURL {
	
	public static WebDriver launchingApp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://automationpractice.com");
		driver.manage().window().maximize();
		return driver;
	}


}
