package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Input_interacts extends BaseClass{

	@Test
	public void InputLink() {
		driver.navigate().back();
		WebElement link=driver.findElement(By.linkText("Inputs"));
		link.click();
	}
	
	@Test(dependsOnMethods = "InputLink")
	public void Inputs() {
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@type='number']"));
		inputbox.sendKeys("15");
		inputbox.sendKeys(Keys.ARROW_UP);
		inputbox.sendKeys(Keys.ARROW_UP);
		inputbox.sendKeys(Keys.ARROW_UP);
		inputbox.sendKeys(Keys.ARROW_UP);
		inputbox.sendKeys(Keys.ARROW_DOWN);
	}
}
