package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Key_Presses extends BaseClass{

	@Test
	public void KeyPressesLink() {
		
		driver.navigate().back();
		WebElement keypresslink=driver.findElement(By.linkText("Key Presses"));
		keypresslink.click();
	}
	
	@Test(dependsOnMethods = "KeyPressesLink")
	public void KeyPresses_Interact() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement inputbox= driver.findElement(By.xpath("//input[@id='target']"));
		WebElement msg=driver.findElement(By.xpath("//p[@id='result']"));

		inputbox.sendKeys("5");
		System.out.println(msg.getText());
		inputbox.sendKeys(Keys.BACK_SPACE);
		System.out.println(msg.getText());
		inputbox.sendKeys(Keys.CONTROL);
		System.out.println(msg.getText());
		
		
	}
}


//p[@id='result']