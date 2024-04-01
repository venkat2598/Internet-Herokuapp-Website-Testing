package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Form_Authentication extends BaseClass {

	@Test
	public void FormAuthenticationLink() {

		driver.navigate().back();
		driver.navigate().back();
		WebElement FAlink=driver.findElement(By.linkText("Form Authentication"));
		FAlink.click();
	}


	@Test(dependsOnMethods ="FormAuthenticationLink" )
	public void FormAuthenticationUsingInvalidCredentials() {

		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("TomSmith");

		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");

		WebElement LoginBtn=driver.findElement(By.className("radius"));
		LoginBtn.click();

		WebElement Flashmsg=driver.findElement(By.xpath("//div[@id='flash']"));
		String actualmsg=Flashmsg.getText();
		System.out.println(actualmsg);
	}



	@Test(dependsOnMethods ="FormAuthenticationUsingInvalidCredentials" )
	public void FormAuthenticationUsingValidCredentials() {

		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");

		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");

		WebElement LoginBtn=driver.findElement(By.className("radius"));
		LoginBtn.click();
	}

	@Test(dependsOnMethods = "FormAuthenticationUsingValidCredentials")
	public void VerifyCredentialsInfo()
	{
		WebElement Flashmsg=driver.findElement(By.xpath("//div[@id='flash']"));
		String actualmsg=Flashmsg.getText();
		System.out.println(actualmsg);

		WebElement msg=driver.findElement(By.tagName("h4"));
		String message=msg.getText();
		System.out.println(message);

	}

	@Test(dependsOnMethods = "VerifyCredentialsInfo")
	public void LogoutAccount() {

		WebElement Logoutbtn=driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
		Logoutbtn.click();

		WebElement Flashmsg=driver.findElement(By.xpath("//div[@id='flash']"));
		String actualmsg=Flashmsg.getText();
		System.out.println(actualmsg);
	}

}
