package selenium_basic_learning.SeleniumBasicLearning1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestTest 
{
	@Test
	public void Login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.ru");
	}
}
