package SeleniumAuto;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ById;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TestCases {

		public static void Testcase1()
		{
		WebDriver driver = EnterURL.launchingApp();
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(ById.name("SubmitLogin")).click();
		
		String pageTitle = driver.getTitle();
		
		if(pageTitle == "Login - My Store")
		{
			System.out.println("Logged in Successfully");
		
		}
		else 
		{
			System.out.println("Invalid Username/Password");
			
		driver.close();
		
		//driver.findElement(arg0)
	//	driver.quit();
		}

}

	
	}