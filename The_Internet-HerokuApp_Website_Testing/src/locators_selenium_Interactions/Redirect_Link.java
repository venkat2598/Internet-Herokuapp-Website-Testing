package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Redirect_Link extends BaseClass {

	@Test
	public void RedirectLink() {
		driver.navigate().to(URL);
		WebElement Redirectlink=driver.findElement(By.linkText("Redirect Link"));
		Redirectlink.click();

	}

	@Test(priority = 1)
	public void Redirect_LinkInteract() {

		WebElement clickText=driver.findElement(By.linkText("here"));
		clickText.click();
	}

	@Test(priority = 2)
	public void HttpStatusCode200() {

		WebElement statuscode200=driver.findElement(By.linkText("200"));
		statuscode200.click();

		WebElement getmsg= driver.findElement(By.tagName("p"));
		System.out.println("Status code 200 Msg :" + getmsg.getText());

		driver.navigate().back();
	}

	@Test(priority = 3)
	public void HttpStatusCode301() {

		WebElement statuscode301=driver.findElement(By.linkText("301"));
		statuscode301.click();

		WebElement getmsg= driver.findElement(By.tagName("p"));
		System.out.println("Status code 301 Msg :" + getmsg.getText());

		driver.navigate().back();
	}

	@Test(priority = 4)
	public void HttpStatusCode404() {

		WebElement statuscode404=driver.findElement(By.linkText("404"));
		statuscode404.click();

		WebElement getmsg= driver.findElement(By.tagName("p"));
		System.out.println("Status code 404 Msg :" + getmsg.getText());

		driver.navigate().back();
	}

	@Test(priority = 5)
	public void HttpStatusCode500() {

		WebElement statuscode500=driver.findElement(By.linkText("500"));
		statuscode500.click();

		WebElement getmsg= driver.findElement(By.tagName("p"));
		System.out.println("Status code 500 Msg :" + getmsg.getText());
	}

}
