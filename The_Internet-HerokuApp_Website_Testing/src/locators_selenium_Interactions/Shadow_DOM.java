package locators_selenium_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Shadow_DOM extends BaseClass{

	@Test
	public void ShadowDOMLink() {
		driver.navigate().to(URL);
		WebElement ShadowDOMlink=driver.findElement(By.linkText("Shadow DOM"));
		ShadowDOMlink.click();
	}

	@Test(priority = 1)
	public void ShadowDOM() {
		WebElement shadextext = driver.findElement(By.xpath("//div[@id='content']//span"));
		System.out.println("Shadow Text 1 : " + shadextext.getText());

		List<WebElement> shadowtext2 = driver.findElements(By.xpath("//div[@id='content']//ul/li"));
		for (WebElement shadowtexts : shadowtext2) {
			System.out.println("Shadow Text 2 : " + shadowtexts.getText());
			}
		

	} 

}


