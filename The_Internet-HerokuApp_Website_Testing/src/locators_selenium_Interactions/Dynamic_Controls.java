package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Dynamic_Controls extends BaseClass{

	@Test
	public void DynamicControlsLink() {

		driver.navigate().back();
		WebElement DYctrllink = driver.findElement(By.linkText("Dynamic Controls"));
		DYctrllink.click();
	}

	@Test(priority = 1)
	public void RemoveCheckBox() {

		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();

		WebElement Removebtn=driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
		Removebtn.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement msg = driver.findElement(By.id("message"));
		String actualmsg=	msg.getText();
		Assert.assertEquals(actualmsg, "It's gone!");

	}

	@Test(priority = 2)
	public void AddCheckBox() {

		WebElement Addbtn= driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
		Addbtn.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement checkBox= driver.findElement(By.id("checkbox"));
		checkBox.click();

		WebElement msg = driver.findElement(By.id("message"));
		String actualmsg= msg.getText();
		Assert.assertEquals(actualmsg, "It's back!");

	}


	@Test(priority = 3)
	public void VerifyInputBox() {

		WebElement inputBox = driver.findElement(By.xpath("//h4/following::input[2]"));
		boolean enable =inputBox.isEnabled();
		System.out.println(enable);
	}

	@Test(priority = 4)
	public void EnableInputBox() {


		WebElement enablebtn=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		enablebtn.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement input = driver.findElement(By.xpath("//form[@id='input-example']/input[@type='text']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(input)).sendKeys("Hello !");

		WebElement msg = driver.findElement(By.id("message"));
		String actualmsg= msg.getText();
		Assert.assertEquals(actualmsg, "It's enabled!");	

	}


	@Test(dependsOnMethods = "EnableInputBox") 
	public void DisableInputBox() {

		WebElement disablebtn= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		disablebtn.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement msg = driver.findElement(By.id("message"));
		String actualmsg= msg.getText();
		Assert.assertEquals(actualmsg, "It's disabled!");
		
		
	}
}
