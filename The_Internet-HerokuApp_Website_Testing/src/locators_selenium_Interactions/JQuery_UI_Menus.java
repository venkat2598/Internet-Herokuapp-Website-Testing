package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class JQuery_UI_Menus extends BaseClass {

	@Test
	public void JQuery_UI_MenusLink() {
		driver.navigate().to(URL);
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'JQuery UI Menus')]"));
		link.click();
	}

	@Test(dependsOnMethods = "JQuery_UI_MenusLink")
	public void JQueryUIMenus() {


		WebElement Disablebtn=driver.findElement(By.id("ui-id-1"));
	if(Disablebtn.isEnabled()) {
		System.out.println("button is disabel! ");
	}
	
		WebElement Enablebtn=driver.findElement(By.id("ui-id-3"));
		if(Enablebtn.isEnabled());
		{
			Enablebtn.click();
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement downloadbtn=driver.findElement(By.id("ui-id-4"));
			wait.until(ExpectedConditions.elementToBeClickable(downloadbtn)).click();
			
			WebElement pdfbtn=driver.findElement(By.xpath("//li[@id='ui-id-5']/a"));
			wait.until(ExpectedConditions.elementToBeClickable(pdfbtn)).click();
		}


	}
}
