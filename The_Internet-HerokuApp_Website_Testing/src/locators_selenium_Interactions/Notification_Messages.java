package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Notification_Messages extends BaseClass {


	@Test
	public void Notification_MessagesLink() {

		driver.navigate().back();
		WebElement Notification_MessagesLink=driver.findElement(By.linkText("Notification Messages"));
		Notification_MessagesLink.click();
	}

	@Test(dependsOnMethods = "Notification_MessagesLink")
	public void NotificationMessages() {

		WebElement FlashMsg=driver.findElement(By.xpath("//div[@id='flash']"));
		String initalmsg=FlashMsg.getText();
		System.out.println(initalmsg);

		WebElement clicktext=driver.findElement(By.linkText("Click here"));
		clicktext.click();
		WebElement FMsg=driver.findElement(By.xpath("//div[@id='flash']"));
		String Msg=FMsg.getText();
		System.out.println(Msg);




	}
}
