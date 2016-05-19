package selenium_basic_learning.SeleniumBasicLearning1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestTest 
{
	//WebDriver driver = new InternetExplorerDriver();
	WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
	private boolean acceptNextAlert = true;
	
	@Test
	public void Login()
	{		
		driver.get("http://google.ru");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("admin");
	}
	
	 //@Test
	  public void testUntitled() throws Exception {
	    // open | /php4dvd/ |		 
		  driver.get("http://localhost/php4dvd/");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	    // type | id=username | admin
		  driver.findElement(By.id("username")).clear();
		  driver.findElement(By.id("username")).sendKeys("admin");
	    // type | name=password | admin
		  driver.findElement(By.name("password")).clear();
		  driver.findElement(By.name("password")).sendKeys("admin");
	    // click | name=submit | 
		  driver.findElement(By.name("submit")).click();
	  }

	 /* private boolean isElementPresent(By by) {
	    try {
	    	driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }*/

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
