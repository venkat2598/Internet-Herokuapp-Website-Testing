package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class JavaScript_Alerts extends BaseClass{

	@Test
	public void JavaScriptAlertsLink() {

		driver.navigate().back();
		WebElement jsAlertlink=driver.findElement(By.linkText("JavaScript Alerts"));
		jsAlertlink.click();
	}
	@Test(dependsOnMethods = "JavaScriptAlertsLink")
	public void JavaScriptAlerts() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		jsAlert.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement result =driver.findElement(By.xpath("//p[@id='result']"));
		String alert1 =result.getText();
		System.out.println(alert1);

		WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		jsConfirm.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		alert.accept();
		String alertconfirm =result.getText();
		System.out.println(alertconfirm);

		WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsPrompt.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		alert.sendKeys("Hello Alert!");
		alert.accept();
		String alertprompt =result.getText();
		System.out.println(alertprompt);






	}
}
