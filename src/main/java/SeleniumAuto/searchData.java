package SeleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;;


public class searchData {
	
	public static void Testcase2()
	{
	WebDriver driver = EnterURL.launchingApp();
	driver.findElement(By.id("search_query_top")).sendKeys("Dress");
	driver.findElement(By.name("submit_search")).click();
			
    //Sorting
	//WebElement sortby =driver.findElement(By.id("selectProductSort")) ;  
	Select sortBy = new Select(driver.findElement(By.id("selectProductSort"))); 
	sortBy.selectByIndex(2);
	
	//driver.findElement(By.className("heading-counter")).getText();
	System.out.println(driver.findElement(By.className("heading-counter")).getText());
	
	
	
	
	
	driver.close();
	driver.quit();
	
	
	Actions Ac1 = new Actions(driver);
	{
		
	
	}
	}
}
