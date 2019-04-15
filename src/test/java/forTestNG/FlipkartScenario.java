package forTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class FlipkartScenario {
  @Test
  
  //Browser Launch
  public void FLipkart () throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver driver = new ChromeDriver() ;
  driver.manage().window().maximize();
  
  /*
  driver.navigate().to("https://www.flipkart.com");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
//  driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("9999359605");
//  
//  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sikandrarao");
//  driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
  driver.findElement(By.xpath("//button[@class = '_2AkmmA _29YdH8']")).click();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
  driver.findElement(By.className("LM6RPg")).click();
  driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Samsung A8 plus cover" +  Keys.ENTER);
  
  

  //driver.findElement(By.className("vh79eN")).click();
  Thread.sleep(10000);
  
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.scrollBy(0,200)");
  
  Thread.sleep(10000);
  
  driver.findElement(By.xpath("//img[@alt='Kizil Back Cover for Samsung Galaxy A8 Plus']")).click();*/
  
  
  driver.navigate().to("https://www.flipkart.com/kizil-back-cover-samsung-galaxy-a8-plus/p/itmfd8wqphgwfdq9?pid=ACCFD8WJ55EUDYHB&lid=LSTACCFD8WJ55EUDYHBM57IVP&marketplace=FLIPKART&srno=s_1_8&otracker=search&otracker1=search&fm=SEARCH&iid=c3b26dc3-e229-4ed2-873e-24c3fa8b05f7.ACCFD8WJ55EUDYHB.SEARCH&ppt=Homepage&ppn=Homepage&ssid=wchivb7ra80000001554541988707&qH=ad93c630593140cb");	  
 
  }	
}
