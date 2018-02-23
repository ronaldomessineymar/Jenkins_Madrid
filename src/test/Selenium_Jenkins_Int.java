package test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_Jenkins_Int {
	
	
        WebDriver driver;
	    @BeforeMethod 
		public void SetUp (){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			driver  = new ChromeDriver();
			driver.get("http://google.com");
			
				}
	    
	    @Test
	    public void test (){
	    	WebElement search_box = driver.findElement(By.name("q"));
	    	search_box.sendKeys("porsche"+Keys.ENTER);
	    	Assert.assertTrue(driver.getTitle().contains("porsche"));
	    	
	    }
		
	    @AfterMethod
	    public void tearDown(){
	    	driver.quit();
	    	
	    }
	}
	




