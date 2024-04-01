package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Entry_Ad extends BaseClass {

	@Test
	public void EntryAdlink() {
		driver.navigate().back();
		WebElement EntryAdlink=driver.findElement(By.linkText("Entry Ad"));
		EntryAdlink.click();

	}
	
	@Test(dependsOnMethods = "EntryAdlink")
	public void handleEntryAd() {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement closebtn=driver.findElement(By.xpath("//div[@class='modal-footer']/p"));
		wait.until(ExpectedConditions.elementToBeClickable(closebtn)).click();
	
	}
}
