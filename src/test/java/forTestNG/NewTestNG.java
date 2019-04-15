package forTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import SeleniumAuto.EnterURL;

public class NewTestNG {
  @Test
  
	  public static String Testcase1()
		{
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://automationpractice.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(ById.name("SubmitLogin")).click();
		
		String pageTitle = driver.getTitle();
		return pageTitle;
		
//		if(pageTitle == "Login - My Store")
//		{
//			System.out.println("Logged in Successfully");
//		
//		}
//		else 
//		{
//			System.out.println("Invalid Username/Password");
//			
//		driver.close();
//		}
  }
}
