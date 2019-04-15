package SeleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringsProgram {
	
	public static void main (String [] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.goibibo.com");
		  
		  Thread.sleep(2000);
		    
		 WebElement ele = driver.findElement(By.xpath("//img[@src='https://gos3.ibcdn.com/tcf_roadblock-1553501027.jpg']"));
		  
		  System.out.println(ele.isDisplayed());
		  //driver.findElement(By.xpath("//i[@class = 'wewidgeticon we_close']")).click();
/*	static String str1 = "USA" ;
	char ch;
	
	public static void main(String[] args) {
		
		for(int i=str1.length()-1 ; i>=0; i--)
		{
		char rev = str1.charAt(i);
			
		System.out.print(rev);
		}
		
		
		*/
	}

}
