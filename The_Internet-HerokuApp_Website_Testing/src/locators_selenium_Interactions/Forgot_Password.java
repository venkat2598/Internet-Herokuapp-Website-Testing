package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Forgot_Password extends BaseClass{

	@Test
	public void ForgotPasswordlink() {

		driver.navigate().to(URL);
		WebElement FPlink=	driver.findElement(By.linkText("Forgot Password"));
		FPlink.click();
	}

	@Test(dependsOnMethods = "ForgotPasswordlink")
	public void ForgotPassword() {

		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("abc@gmail.com");

		WebElement RpasswordBtn= driver.findElement(By.id("form_submit"));
		RpasswordBtn.click();

		WebElement ErrorMSG=driver.findElement(By.tagName("h1"));
		String msg=ErrorMSG.getText();
		System.out.println(msg);
	}

}
