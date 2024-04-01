package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Horizontal_Slider extends BaseClass {

	@Test
	public void HorizontalSliderLink() {

	
		driver.navigate().to(URL);
		WebElement HSliderLink=driver.findElement(By.linkText("Horizontal Slider"));
		HSliderLink.click();
	}

	@Test(dependsOnMethods = "HorizontalSliderLink")
	public void HorizontalSlider() {
		WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
		Actions move = new Actions(driver);
		move.clickAndHold(slider).sendKeys(Keys.ARROW_RIGHT).build().perform();
	}
}