package forTestNG;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
 
	WebDriver driver;

	
	@Test
	public void AmazonURL()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.navigate().to("https://www.amazon.in"); 
	}

	@Test
	public void Testcase1() throws InterruptedException
	{
	/*	Thread.sleep(1000);
		
		Actions action1 = new Actions (driver);
		action1.moveToElement(driver.findElement(By.id("nav-link-shopall"))).build().perform();
		Thread.sleep(1000);
		
		action1.moveToElement(driver.findElement(By.xpath("//span[@data-nav-panelkey='TvApplElecPanel']"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()= 'Headphones']")).click();
		Thread.sleep(2000);
		
			
	//driver.findElement(By.name("s-ref-checkbox-10440599031")).click();
		driver.findElement(By.name("s-ref-checkbox-4931671031")).click();
		Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[@data-action =['a-dropdown-button']")).click();
	//driver.findElement(By.xpath("//span[@class=['a-dropdown-container']")).click();
	//driver.findElement(By.id("a-autoid-1")).click();
	//driver.findElement(By.id("s-result-sort-select_1")).click();
		//Select 4 star and plus
		driver.findElement(By.xpath("//span[text()= '4 Stars & Up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()= 'JBL']")).click();
		//Scroll down 
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//  js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		System.out.println("111111111111");
	//	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		  driver.findElement(By.xpath("//img[@alt='JBL C200SI in-Ear Headphones with Mic (Gun Metal)']")).click();
		 
		  Thread.sleep(2000);
		 // driver.switchTo().window(tabs.get(0));
		//  driver.switchTo().window(tabs.get(1));
		
		  System.out.println("NNNNNNNNNNNNNNNNN"); 
		 */ 
		  driver.navigate().to("https://www.amazon.in/JBL-C200SI-Ear-Headphones-Metal/dp/B07DFYSGS3/ref=sr_1_6?fst=as%3Aoff&qid=1555163689&refinements=p_n_is_cod_eligible%3A4931671031%2Cp_89%3AJBL&rnid=3837712031&s=electronics&sr=1-6");
		  
		  System.out.println("1234");
		  driver.findElement(By.xpath("//a[@title='Add to Shopping Cart']")).click();
		  System.out.println("1234");


	}

}