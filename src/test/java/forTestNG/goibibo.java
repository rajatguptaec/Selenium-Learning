package forTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class goibibo {

	WebDriver driver;
	@BeforeTest
	public void Testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.goibibo.com"); 
	}

	@Test
	public void Testcase2 () throws InterruptedException {
		
		// WebDriver driver = Testcase1() ;
		String defaultvalue = driver.findElement(By.xpath("//span[@class='curPointFlt switchAct']")).getText();

		if (defaultvalue.contains("Round")){
			System.out.println("One Way is selected");
		}
		else
		{System.out.println("One Way is not selected");}

		//Select Source, Destination, Date and click on Search icon
		driver.findElement(By.id("gosuggest_inputSrc")).click();
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.id("gosuggest_inputDest")).click();
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		//Select Departure date

		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		Thread.sleep(2000);
		//	driver.findElement(By.xpath("//span[@role='button']")).click();

		//driver.findElement(By.xpath("//div[@role='heading']")).click();
		String dateTime = driver.findElement(By.xpath("//div[text()= 'April 2019']")).getAttribute("innerText");
		Thread.sleep(2000);
		System.out.println(dateTime);

		if (dateTime.contains("Dec")) {
			driver.findElement(By.id("fare_20190425")).click();
			Thread.sleep(2000);
		}
		else {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("fare_20190615")).click();
		}
		//Return date
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fare_20190620")).click();
		//Verify if Round Trip is selected
		String defaultvalue2 = driver.findElement(By.xpath("//span[@class='curPointFlt switchAct']")).getText();
		System.out.println(defaultvalue2);

		//Select Travelers
		driver.findElement(By.id("pax_link_common")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("adultPaxPlus")).click();
		driver.findElement(By.id("adultPaxPlus")).click();
		Thread.sleep(3000);
		//Click on Search icon
		driver.findElement(By.id("gi_search_btn")).click();
		Thread.sleep(2000);

			//Check Lowest Price when one way flight is selected
		//String sortPrice = driver.findElement(By.className("fltSortSelect")).getText() ;
//		String sortprice1 = driver.findElement(By.xpath("//li[@class='fltSortSelect']//a")).getAttribute("innerText") ;
//		System.out.println(sortprice1);
//
//		if (sortPrice == "sortByPriceOnwli") {
//			System.out.println(sortPrice); }
//			else
//				{System.out.println("Incorrect");}
//					}
				
		//filter time 
		driver.findElement(By.id("timesFilter")).click();
		driver.findElement(By.id("onw_before11")).click();
	
		//filter Stops
		//driver.navigate().to("https://www.goibibo.com/flights/air-DEL-BOM-20190606-20190607-1-0-0-E-D/");
		//Thread.sleep(3000);
		driver.findElement(By.id("stopsFilter")).click();
		driver.findElement(By.xpath("//label[@for='stop_0']")).click();
		Thread.sleep(2000);
		
		//filter flights
		driver.findElement(By.id("airlinesFilter")).click();
		driver.findElement(By.xpath("//label[@for='airline_AI']")).click();
		driver.findElement(By.xpath("//label[@for='airline_I5']")).click();
		driver.findElement(By.xpath("//label[@for='airline_SG']")).click();
		driver.findElement(By.xpath("//label[@for='airline_UK']")).click();
		Thread.sleep(2000);
		
		//filter with price range
		//driver.findElement(By.id("pricesFilter")).click();
		driver.findElement(By.xpath("//label[@for='refundable_tickets']")).click();
		
		String cheapestPrice = driver.findElement(By.xpath("//span[@class ='ico24 fr fb']")).getAttribute("innerText") ;
		System.out.println("The cheapest flight cost is : "+cheapestPrice);
		
		driver.quit();
	
	}
}
