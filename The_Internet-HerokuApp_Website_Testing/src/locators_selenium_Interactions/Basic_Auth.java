package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic_Auth {
	WebDriver driver;
	
	
	@Test
	public void BaseAuthLink() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		String BasicAuthUrl="https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(BasicAuthUrl);
	}
	
	@Test(dependsOnMethods ="BaseAuthLink" )
	public void verify() {
		
		WebElement msg = driver.findElement(By.cssSelector("p"));
		String actualtext=msg.getText();
		Assert.assertEquals(actualtext, "Congratulations! You must have the proper credentials.");
		driver.quit();
	}

}
