package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Digest_Authentication {

WebDriver driver;
	
	
	@Test
	public void Digest_AuthenticationSignIn() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		String DigestAuthUrl="https://admin:admin@the-internet.herokuapp.com/digest_auth";
		driver.get(DigestAuthUrl);
	}
	
	@Test(dependsOnMethods ="Digest_AuthenticationSignIn" )
	public void verify() {
		
		WebElement Conformationnmsg = driver.findElement(By.cssSelector("p"));
		String actualtext=Conformationnmsg.getText();
		Assert.assertEquals(actualtext, "Congratulations! You must have the proper credentials.");
		driver.quit();
	}

}
