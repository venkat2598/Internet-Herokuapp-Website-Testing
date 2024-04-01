package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Infinite_Scroll extends BaseClass{

	@Test
	public void Infinite_ScrollLink() {
		driver.navigate().to(URL);
		WebElement IScrolllink=driver.findElement(By.linkText("Infinite Scroll"));
		IScrolllink.click();

	}

	@Test(dependsOnMethods ="Infinite_ScrollLink" )
	public void InfiniteScroll() {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		while (true) {
			// Scroll to the bottom of the page
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			// Wait for some time after scrolling
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		
		
	}
	
}

