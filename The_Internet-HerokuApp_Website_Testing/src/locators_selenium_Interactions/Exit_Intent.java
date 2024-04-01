package locators_selenium_Interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Exit_Intent extends BaseClass{

	@Test
	public void ExitIntentLink() {

		driver.navigate().back();
		WebElement link=driver.findElement(By.linkText("Exit Intent"));
		link.click();

	}

	@Test
	public void ExitIntent() {
		Robot robot=null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.mouseMove(600, 0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement closeModel =driver.findElement(By.xpath("//div[@class='modal-footer']/p"));
		closeModel.click();
	}
}
